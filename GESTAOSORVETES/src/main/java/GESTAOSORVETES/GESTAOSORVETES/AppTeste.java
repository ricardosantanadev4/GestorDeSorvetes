package GESTAOSORVETES.GESTAOSORVETES;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.swing.text.DateFormatter;

import entidade.Lote;
import entidade.Sorvete;
import util.JpaUtil;

public class AppTeste {

	public static void main(String[] args) {

		// Traz uma lista de todos sorvetes com todos os seus dados
//		Sorvete svt = new Sorvete();
//		List<Sorvete> listaSorvete = buscarTodos(svt);
//		for(Sorvete sorvete : listaSorvete ) {
//			System.out.println("CódigoProduto: "+sorvete.getCodigoProduto() +" Marca "+ sorvete.getMarca() +" Sabor "+ sorvete.getSabor()
//			+" InícioValidade "+ sorvete.getInicioValidade() +" FimValidade "+ sorvete.getFimValidade() +" CódigoLote "+ sorvete.getLote().getCodigoLote() +" PreçoCusto "+ sorvete.getPrecoCusto()
//			+" PreçoVenda "+ sorvete.getPrecoVenda());
//		}
//		System.out.println("+++++++++++=++=+++++++++++++++=++++++++++++++++++++=++++++++++++++++");
//		System.out.println();

		// Traz uma lista de todos sorvetes de um sabor específico
//		String sabor = "AzEiToNaVeRdE";
//		Sorvete svt = new Sorvete();
//		List<Sorvete> listaSorvete01 = buscarTodos(svt);
//		for(Sorvete svt01 : listaSorvete01) {
//			if(svt01.getSabor() .equalsIgnoreCase(sabor)) {
//				System.out.println("CódigoProduto: "+svt01.getCodigoProduto() +" Marca "+ svt01.getMarca() +" Sabor "+ svt01.getSabor()
//				+" InícioValidade "+ svt01.getInicioValidade() +" FimValidade "+ svt01.getFimValidade() +" CódigoLote "+ svt01.getLote().getCodigoLote() +" PreçoCusto "+ svt01.getPrecoCusto()
//				+" PreçoVenda "+ svt01.getPrecoVenda());
//			}
//		}

//		System.out.println("+++++++++++=++=+++++++++++++++=++++++++++++++++++++=++++++++++++++++");
//		System.out.println();

		// Traz uma lista de todos os lotes de sorvetes
//		Lote lote = new Lote();
//		List<Lote> lotes = buscarTodos(lote);
//		for(Lote lt : lotes) {
//			System.out.println("CódigoLote: "+ lt.getCodigoLote() +" Marca "+ lt.getMarca() +" Sabor "+ lt.getSabor()
//			+" InícioValidade "+ lt.getInicioValidade() +" FimValidade "+ lt.getFimValidade() +" PreçoCusto "+ lt.getCusto()
//			+" PreçoVenda "+ lt.getVenda());
//		}

		// Traz uma lista de todos lotes de um sabor específico
//		String sabor = "mOrAnGo";
//		Lote lote = new Lote();
//		List<Lote> listaLote01 = buscarTodos(lote);
//		for (Lote lt01 : listaLote01) {
//			if (lt01.getSabor() .equalsIgnoreCase(sabor)) {
//				System.out.println("CódigoLote: " + lt01.getCodigoLote() + " Marca " + lt01.getMarca() + " Sabor "
//						+ lt01.getSabor() + " InícioValidade " + lt01.getInicioValidade() + " FimValidade "
//						+ lt01.getFimValidade() + " PreçoCusto " + lt01.getCusto() + " PreçoVenda " + lt01.getVenda());
//			}
//		}

		// (Abastecer Lotes)
		// Só pode inserir um sorvete em todos os lotes que tem a mesma, marca, sabor e
		// validade do sorvete
//		String marca = "xBoM", sabor = "MoRaNgO", inicioValidade = "21/01/2021", fimValidade = "21/04/2021";
//		int codigoLoteSorvet = 0;
//		double precoCusto = 0, precoVenda = 0;
//		
//		Lote lote01 = new Lote();
//		Sorvete svt01 = new Sorvete();
//		List<Lote> listaLotes = buscarTodos(lote01);
//		for(Lote ll : listaLotes) {
//			if(ll.getMarca() .equalsIgnoreCase(marca) && (ll.getSabor() .equalsIgnoreCase(sabor))
//					&& (ll.getInicioValidade() .equalsIgnoreCase(inicioValidade))
//					&& (ll.getFimValidade() .equalsIgnoreCase(fimValidade))){						
//				svt01.setMarca(marca);
//				svt01.setSabor(sabor);
//				svt01.setInicioValidade(inicioValidade);
//				svt01.setFimValidade(fimValidade);				
//				svt01.setLote(ll);
//				svt01.setPrecoCusto(precoCusto);
//				svt01.setPrecoVenda(precoVenda);
//				inserir(svt01);
//			}
//		}

//		// Só pode inseir um sorvete em um lote específico que tenha a mesma, marca,
//		// sabor e validade do sorvete
//
//		String marca = "XTUDO", sabor = "CAJÁ", inicioValidade = "21/01/2021", fimValidade = "21/04/2021";
//		int codigoLote = 5;
//		double precoCusto = 1, precoVenda = 2;
//		
//		Sorvete svt02 = new Sorvete();
//		Lote lote = new Lote();
//		Lote loteIndividual = (Lote)buscarUmObjetoEspecifico(Lote.class, codigoLote);
//		if(loteIndividual.getMarca() .equalsIgnoreCase(marca) && (loteIndividual.getSabor() .equalsIgnoreCase(sabor)
//				&& (loteIndividual.getInicioValidade() .equalsIgnoreCase(inicioValidade)
//				&& (loteIndividual.getFimValidade() .equalsIgnoreCase(fimValidade))))) {
//		svt02.setMarca(marca);
//		svt02.setSabor(sabor);
//		svt02.setInicioValidade(inicioValidade);
//		svt02.setFimValidade(fimValidade);
//		svt02.setLote(loteIndividual);
//		svt02.setPrecoCusto(precoCusto);
//		svt02.setPrecoVenda(precoVenda);
//		inserir(svt02);
//		}

		// Inserir um novo lote:
//		String marca = "macaiba", sabor = "macaiba", inicioValidade = "20/12/2020", fimValidade ="";
//		double precoCusto = 25.00, precoVenda = 50.00;
//		Lote lote = new Lote();
//        lote.setMarca(marca);
//        lote.setSabor(sabor);
//        lote.setInicioValidade(inicioValidade);
//        lote.setFimValidade(fimValidade);
//        lote.setCusto(precoCusto);
//        lote.setVenda(precoVenda);
//        inserir(lote);

		// Exibir a quantidade de lotes
//		Lote lote = new Lote();
//		List<Lote> lotes  = buscarTodos(lote);
//		int soma = 0;
//		for (int i = 0; i < lotes.size(); i++) {			
//			System.out.println("Somando.. "+" ÍdiceLote "+ i +" CódigoLote "+ lotes.get(i).getCodigoLote());
//			soma++;
//		}
//		System.out.println("Total de Lotes: "+ soma);

		// Exibir a quantidade de sorvetes
//		Sorvete svt = new Sorvete();
//		int soma = 0;
//		List<Sorvete> sorvetes = buscarTodos(svt);
//		for (int i = 0; i < sorvetes.size(); i++) {
//			System.out.println(" Ídices "+ i +" CódigoSorvete "+ sorvetes.get(i).getCodigoProduto());
//			soma ++;
//		}
//		System.out.println("Total de Sorvetes "+soma);

		// Sinalizar quano um sorvete e/ou um lote estiver próximo do vencimento e
		// solicitar que o
		// sorvete e/ou lote seja vendido em promoção
//		Sorvete sorvete = new Sorvete();
//		List<Sorvete> sorvetes = buscarTodos(sorvete);
//		LocalDate hoje = LocalDate.now();
//		for (Sorvete s : sorvetes) {
//			LocalDate fimDate = LocalDate.parse(s.getFimValidade(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//			if (hoje.isBefore(fimDate) |(hoje.isEqual(fimDate))) {
//				long diferencaEmDias = ChronoUnit.DAYS.between(hoje, fimDate);
//				if (diferencaEmDias <= 10) {
//					System.out.println("Sorvete próximo do vencimento! Código do produto: "+ s.getCodigoProduto()+" FimVencimento "+ s.getFimValidade() +" Hoje é "+ hoje +" Faltam " + diferencaEmDias +" dia/s "+ " Coloque o produto em promoção!");
//				}
//			}
//		}

//		Lote lote = new Lote();
//		List<Lote> lotes = buscarTodos(lote);
//		LocalDate hoje = LocalDate.now();
//		for (Lote l : lotes) {
//			LocalDate fimDate = LocalDate.parse(l.getFimValidade(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//			if (hoje.isBefore(fimDate) | (hoje.isEqual(fimDate))) {
//				long diferencaEmDias = ChronoUnit.DAYS.between(hoje, fimDate);
//				if (diferencaEmDias <= 10) {
//					System.out.println("Lote próximo do vencimento! Código do lote: "+ l.getCodigoLote()+" FimVencimento "+ l.getFimValidade() +" Hoje é "+ hoje +" Faltam " + diferencaEmDias +" dia/s para o vencimento! Coloque o produto em promoção!");
//				}
//			}
//		}

		// Solicitar a retirada do lote e dos sorvetes quando estiverem vencidos.
//		Lote lote = new Lote();
//		List<Lote> lotes = buscarTodos(lote);
//		LocalDate hoje = LocalDate.now();
//		for(Lote l : lotes) {
//			LocalDate fimDate = LocalDate.parse(l.getFimValidade(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//			if(fimDate.isBefore(hoje)) {
//				System.out.println(" Lote vencido! Solicite Remoção Imediatamente! "+" Código do lote: "+ l.getCodigoLote() +" FimValidade "+ l.getFimValidade()+" Data de Hoje "+ hoje);
//			}
//		}

//		Sorvete sorvete = new Sorvete();
//		List<Sorvete> sorvetes = buscarTodos(sorvete);
//		LocalDate hoje1 = LocalDate.now();
//		for(Sorvete s : sorvetes) {
//			LocalDate fimDate = LocalDate.parse(s.getFimValidade(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//			if(fimDate.isBefore(hoje1)) {
//				System.out.println(" Sovete vencido! Solicite Remoção Imediatamente! "+" Código do produto: "+ s.getCodigoProduto()+" FimValidade "+ s.getFimValidade()+" Data de Hoje "+ hoje);
//			}
//		}

		// Deletar os/o lote/s e sorvete/s vencido/s
		// 1º Tem que deletar os sorvetes por causa da/s FK/S
//		Sorvete sorvete = new Sorvete();
//		List<Sorvete> sorvetes = buscarTodos(sorvete);
//		LocalDate hoje = LocalDate.now();
//		for(Sorvete s : sorvetes) {
//			LocalDate fimDate = LocalDate.parse(s.getFimValidade(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//			if(fimDate.isBefore(hoje)) {
//				System.out.println(" Sovete vencido! Solicite Remoção Imediatamente! "+" Código do produto: "+ s.getCodigoProduto()+" FimValidade "+ s.getFimValidade()+" Data de Hoje "+ hoje);
//				System.out.println(" Deseja inicar a operação 'Delete?' 's/n?'");
//				Scanner scanner = new Scanner(System.in);
//				String st = scanner.nextLine();
//				if (st.equalsIgnoreCase("s")) {					
//				    int i = s.getCodigoProduto();
//				    System.out.println(i);
//					remover(Sorvete.class, i);
//						System.out.println("pop");
//					}
//			}
//		}		

//		Lote lote = new Lote();
//		List<Lote> lotes = buscarTodos(lote);
//		LocalDate hoje1 = LocalDate.now();
//		for (Lote l : lotes) {
//			LocalDate fimDate = LocalDate.parse(l.getFimValidade(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//			if (fimDate.isBefore(hoje1)) {
//				System.out.println(" Lote vencido! Solicite Remoção Imediatamente! " + " Código do lote: "
//						+ l.getCodigoLote() + " FimValidade " + l.getFimValidade() + " Data de Hoje " + hoje);
//				System.out.println(" Deseja inicar a operação 'Delete?' 's/n?'");
//				Scanner scanner = new Scanner(System.in);
//				String s = scanner.nextLine();
//				if (s.equalsIgnoreCase("s")) {					
//			    int i = l.getCodigoLote();
//			    System.out.println(i);
//				remover(Lote.class, i);
//					System.out.println("pop");
//				}
//			}
//		}

	}

	// Fora do main
	public static void inserir(Object obj) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		ent.merge(obj);
		tx.commit();
		ent.close();
		System.out.println("Inserção efetuada com sucesso!");
	}

	public static void remover(Class classe, Object primaryKey) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		Object obj = ent.find(classe, primaryKey);
		tx.begin();
		ent.remove(obj);
		tx.commit();
		ent.close();
		System.out.println(" Descartado! ");
	}

	public static List buscarTodos(Object obj) {
		EntityManager ent = JpaUtil.getEntityManager();
		Query query = ent.createQuery("from " + obj.getClass().getSimpleName());
		List listas = query.getResultList();
		return listas;
	}

	public static Object buscarUmObjetoEspecifico(Class classe, Object chave) {
		EntityManager ent = JpaUtil.getEntityManager();
		return ent.find(classe, chave);
	}

}
