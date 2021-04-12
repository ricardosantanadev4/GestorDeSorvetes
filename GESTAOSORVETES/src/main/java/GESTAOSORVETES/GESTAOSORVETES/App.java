package GESTAOSORVETES.GESTAOSORVETES;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Scanner;

import dao.GestaoGeralDAO;
import dao.GestaoGeralDAOIpml;
import entidade.Lote;
import entidade.Sorvete;

public class App {
	public static void main(String[] args) {
		GestaoGeralDAO geralDAO = new GestaoGeralDAOIpml();
		Scanner scanner = new Scanner(System.in);

		geralDAO.top();
		// (Tela de opções 1)
		System.out.println("Escolha uma das Opções: \n1-Listar\n2-Inserir\n3-Deletar\n(Outra)-sair");
		int opcao = scanner.nextInt();
		System.out.println();

		// (Tela de Opções de lista)
		if (opcao == 1) {
			System.out.println("(Você Escolheu Opções de Lista)");
			System.out.println(
					"Escolha uma das opções:" + "\n1-Trazer uma lista de todos sorvetes com todos os seus dados."
							+ "\n2-Trazer uma lista de todos sorvetes de um sabor específico."
							+ "\n3-Trazer uma lista de todos os lotes de sorvetes"
							+ "\n4-Trazer uma lista de todos lotes de um sabor específico"
							+ "\n5-Exibir a quantidade de lotes" + "\n6-Exibir a quantidade de sorvetes"
							+ "\n7-Verificar se há sorvetes e/ou um lotes próximo do vencimento"
							+ "\n8-Verificar se há sorvetes e/ou  lotes vencidos");
			int opcaoLista = scanner.nextInt();

			if (opcaoLista == 1) {
				// Trazer uma lista de todos sorvetes com todos os seus dados
				Sorvete sorvete = new Sorvete();
				List<Sorvete> listaSorvete = geralDAO.buscarTodos(sorvete);
				for (Sorvete s : listaSorvete) {
					System.out.println("CódigoProduto: " + s.getCodigoProduto() + " Marca " + s.getMarca() + " Sabor "
							+ s.getSabor() + " InícioValidade " + s.getInicioValidade() + " FimValidade "
							+ s.getFimValidade() + " CódigoLote " + s.getLote().getCodigoLote() + " PreçoCusto "
							+ s.getPrecoCusto() + " PreçoVenda " + s.getPrecoVenda());
				}

			} else if (opcaoLista == 2) {
				System.out.println("Escolha o sabor do sorvete que deseja buscar:");
				System.out.println("1-Morango\n2-Côco\n3-Cajá");
				int opcaoSaborSorvete = scanner.nextInt();
				if (opcaoSaborSorvete == 1) {
					// Trazer uma lista de todos sorvetes de um sabor específico
					String sabor = "Morango";
					Sorvete svt = new Sorvete();
					List<Sorvete> listaSorvete01 = geralDAO.buscarTodos(svt);
					for (Sorvete svt01 : listaSorvete01) {
						if (svt01.getSabor().equalsIgnoreCase(sabor)) {
							System.out.println("CódigoProduto: " + svt01.getCodigoProduto() + " Marca "
									+ svt01.getMarca() + " Sabor " + svt01.getSabor() + " InícioValidade "
									+ svt01.getInicioValidade() + " FimValidade " + svt01.getFimValidade()
									+ " CódigoLote " + svt01.getLote().getCodigoLote() + " PreçoCusto "
									+ svt01.getPrecoCusto() + " PreçoVenda " + svt01.getPrecoVenda());
						}
					}

				} else if (opcaoSaborSorvete == 2) {
					// Trazer uma lista de todos sorvetes de um sabor específico
					String sabor = "Côco";
					Sorvete svt = new Sorvete();
					List<Sorvete> listaSorvete01 = geralDAO.buscarTodos(svt);
					for (Sorvete svt01 : listaSorvete01) {
						if (svt01.getSabor().equalsIgnoreCase(sabor)) {
							System.out.println("CódigoProduto: " + svt01.getCodigoProduto() + " Marca "
									+ svt01.getMarca() + " Sabor " + svt01.getSabor() + " InícioValidade "
									+ svt01.getInicioValidade() + " FimValidade " + svt01.getFimValidade()
									+ " CódigoLote " + svt01.getLote().getCodigoLote() + " PreçoCusto "
									+ svt01.getPrecoCusto() + " PreçoVenda " + svt01.getPrecoVenda());
						}
					}

				} else if (opcaoSaborSorvete == 3) {
					// Trazer uma lista de todos sorvetes de um sabor específico
					String sabor = "Cajá";
					Sorvete svt = new Sorvete();
					List<Sorvete> listaSorvete01 = geralDAO.buscarTodos(svt);
					for (Sorvete svt01 : listaSorvete01) {
						if (svt01.getSabor().equalsIgnoreCase(sabor)) {
							System.out.println("CódigoProduto: " + svt01.getCodigoProduto() + " Marca "
									+ svt01.getMarca() + " Sabor " + svt01.getSabor() + " InícioValidade "
									+ svt01.getInicioValidade() + " FimValidade " + svt01.getFimValidade()
									+ " CódigoLote " + svt01.getLote().getCodigoLote() + " PreçoCusto "
									+ svt01.getPrecoCusto() + " PreçoVenda " + svt01.getPrecoVenda());
						}
					}

				}

			} else if (opcaoLista == 3) {
				// Trazer uma lista de todos os lotes de sorvetes
				Lote lote = new Lote();
				List<Lote> lotes = geralDAO.buscarTodos(lote);
				for (Lote lt : lotes) {
					System.out.println("CódigoLote: " + lt.getCodigoLote() + " Marca " + lt.getMarca() + " Sabor "
							+ lt.getSabor() + " InícioValidade " + lt.getInicioValidade() + " FimValidade "
							+ lt.getFimValidade() + " PreçoCusto " + lt.getCusto() + " PreçoVenda " + lt.getVenda());
				}
			} else if (opcaoLista == 4) {
				System.out.println("Escolha o sabor do lote que deseja buscar:");
				System.out.println("1-Morango\n2-Côco\n3-Cajá");
				int opcaoSaborLote = scanner.nextInt();
				if (opcaoSaborLote == 1) {
					// Trazer uma lista de todos lotes de um sabor específico
					String sabor = "Morango";
					Lote lote = new Lote();
					List<Lote> listaLote01 = geralDAO.buscarTodos(lote);
					for (Lote lt01 : listaLote01) {
						if (lt01.getSabor().equalsIgnoreCase(sabor)) {
							System.out.println("CódigoLote: " + lt01.getCodigoLote() + " Marca " + lt01.getMarca()
									+ " Sabor " + lt01.getSabor() + " InícioValidade " + lt01.getInicioValidade()
									+ " FimValidade " + lt01.getFimValidade() + " PreçoCusto " + lt01.getCusto()
									+ " PreçoVenda " + lt01.getVenda());
						}
					}
				} else if (opcaoSaborLote == 2) {
					// Trazer uma lista de todos lotes de um sabor específico
					String sabor = "Côco";
					Lote lote = new Lote();
					List<Lote> listaLote01 = geralDAO.buscarTodos(lote);
					for (Lote lt01 : listaLote01) {
						if (lt01.getSabor().equalsIgnoreCase(sabor)) {
							System.out.println("CódigoLote: " + lt01.getCodigoLote() + " Marca " + lt01.getMarca()
									+ " Sabor " + lt01.getSabor() + " InícioValidade " + lt01.getInicioValidade()
									+ " FimValidade " + lt01.getFimValidade() + " PreçoCusto " + lt01.getCusto()
									+ " PreçoVenda " + lt01.getVenda());
						}
					}
				} else if (opcaoSaborLote == 3) {
					// Trazer uma lista de todos lotes de um sabor específico
					String sabor = "Cajá";
					Lote lote = new Lote();
					List<Lote> listaLote01 = geralDAO.buscarTodos(lote);
					for (Lote lt01 : listaLote01) {
						if (lt01.getSabor().equalsIgnoreCase(sabor)) {
							System.out.println("CódigoLote: " + lt01.getCodigoLote() + " Marca " + lt01.getMarca()
									+ " Sabor " + lt01.getSabor() + " InícioValidade " + lt01.getInicioValidade()
									+ " FimValidade " + lt01.getFimValidade() + " PreçoCusto " + lt01.getCusto()
									+ " PreçoVenda " + lt01.getVenda());
						}
					}
				}
			} else if (opcaoLista == 5) {
				// Exibir a quantidade de lotes
				Lote lote = new Lote();
				List<Lote> lotes = geralDAO.buscarTodos(lote);
				int soma = 0;
				for (int i = 0; i < lotes.size(); i++) {
					System.out
							.println("Somando.. " + " ÍdiceLote " + i + " CódigoLote " + lotes.get(i).getCodigoLote());
					soma++;
				}
				System.out.println("Total de Lotes: " + soma);
			} else if (opcaoLista == 6) {
				// Exibir a quantidade de sorvetes
				Sorvete svt = new Sorvete();
				int soma = 0;
				List<Sorvete> sorvetes = geralDAO.buscarTodos(svt);
				for (int i = 0; i < sorvetes.size(); i++) {
					System.out.println(" Ídices " + i + " CódigoSorvete " + sorvetes.get(i).getCodigoProduto());
					soma++;
				}
				System.out.println("Total de Sorvetes " + soma);
			}

			else if (opcaoLista == 7) {
				// Sinalizar quano um sorvete e/ou um lote estiver próximo do vencimento e
				// solicitar que o
				// sorvete e/ou lote seja vendido em promoção
				Sorvete sorvete = new Sorvete();
				List<Sorvete> sorvetes = geralDAO.buscarTodos(sorvete);
				LocalDate hoje = LocalDate.now();
				for (Sorvete s : sorvetes) {
					LocalDate fimDate = LocalDate.parse(s.getFimValidade(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					if (hoje.isBefore(fimDate) | (hoje.isEqual(fimDate))) {
						long diferencaEmDias = ChronoUnit.DAYS.between(hoje, fimDate);
						if (diferencaEmDias <= 10) {
							System.out.println("Sorvete próximo do vencimento! Código do produto: "
									+ s.getCodigoProduto() + " FimVencimento " + s.getFimValidade() + " Hoje é " + hoje
									+ " Faltam " + diferencaEmDias + " dia/s " + " Coloque o produto em promoção!");
						}
					}
				}
				Lote lote = new Lote();
				List<Lote> lotes = geralDAO.buscarTodos(lote);
				LocalDate hoje1 = LocalDate.now();
				for (Lote l : lotes) {
					LocalDate fimDate = LocalDate.parse(l.getFimValidade(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					if (hoje.isBefore(fimDate) | (hoje.isEqual(fimDate))) {
						long diferencaEmDias = ChronoUnit.DAYS.between(hoje, fimDate);
						if (diferencaEmDias <= 10) {
							System.out.println("Lote próximo do vencimento! Código do lote: " + l.getCodigoLote()
									+ " FimVencimento " + l.getFimValidade() + " Hoje é " + hoje + " Faltam "
									+ diferencaEmDias + " dia/s para o vencimento! Coloque o produto em promoção!");
						}
					}
				}
			} else if (opcaoLista == 8) {
				// Solicitar a retirada do lote e dos sorvetes quando estiverem vencidos.
				Lote lote = new Lote();
				List<Lote> lotes = geralDAO.buscarTodos(lote);
				LocalDate hoje = LocalDate.now();
				for (Lote l : lotes) {
					LocalDate fimDate = LocalDate.parse(l.getFimValidade(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					if (fimDate.isBefore(hoje)) {
						System.out.println(" Lote vencido! Solicite Remoção Imediatamente! " + " Código do lote: "
								+ l.getCodigoLote() + " FimValidade " + l.getFimValidade() + " Data de Hoje " + hoje);
					}
				}

				Sorvete sorvete = new Sorvete();
				List<Sorvete> sorvetes = geralDAO.buscarTodos(sorvete);
				LocalDate hoje1 = LocalDate.now();
				for (Sorvete s : sorvetes) {
					LocalDate fimDate = LocalDate.parse(s.getFimValidade(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					if (fimDate.isBefore(hoje)) {
						System.out.println(" Sovete vencido! Solicite Remoção Imediatamente! " + " Código do produto: "
								+ s.getCodigoProduto() + " FimValidade " + s.getFimValidade() + " Data de Hoje "
								+ hoje);
					}
				}
			}

		}

		if (opcao == 2) {
			System.out.println("(Você Escolheu Opções de Inserir)");
			System.out.println("Escolha uma das opções: "
					+ " \n1-Você pode inserir um sorvete em todos os lotes que tem, a mesma, marca, sabor e validade do sorvete"
					+ "\n2-você pode inseir um sorvete em um lote específico, que tenha a mesma marca, sabor e validade do sorvete"
					+ "\n3-Adicionar um novo lote ao estoque");
			int opcaoInserir = scanner.nextInt();
			if (opcaoInserir == 1) {
				System.out.println("Á baixo estão os lotes disponiveis para inserção: ");
				// Só pode inserir um sorvete em todos os lotes que tem a mesma, marca, sabor e
				// validade do sorvete
				// Trazendo uma lista de todos os lotes de sorvetes
				Lote lote = new Lote();
				List<Lote> lotes = geralDAO.buscarTodos(lote);
				for (Lote lt : lotes) {
					System.out.println("CódigoLote: " + lt.getCodigoLote() + " Marca " + lt.getMarca() + " Sabor "
							+ lt.getSabor() + " InícioValidade " + lt.getInicioValidade() + " FimValidade "
							+ lt.getFimValidade() + " PreçoCusto " + lt.getCusto() + " PreçoVenda " + lt.getVenda());
				}
				System.out.println(
						"Observe os padroes dos lotes a cima e verifique se o sorvete que está tentando inserir matém os padrões de marca, sabor e validade.");
				System.out.println("Digite a Marca do sorvete: ");
				Scanner st = new Scanner(System.in);
				String marca = st.nextLine();

				System.out.println("Digite o sabor do sorvete: ");
				String sabor = st.nextLine();
				System.out.println("Digite o a validade inicial do  sorvete: ");
				String inicioValidade = st.nextLine();
				System.out.println("Digite o data do fim da validade do sorvete: ");
				String fimValidade = st.nextLine();
				double precoCusto = 1, precoVenda = 2;

				Lote lote01 = new Lote();
				Sorvete svt01 = new Sorvete();
				List<Lote> listaLotes = geralDAO.buscarTodos(lote01);
				for (Lote ll : listaLotes) {
					if (ll.getMarca().equalsIgnoreCase(marca) && (ll.getSabor().equalsIgnoreCase(sabor))
							&& (ll.getInicioValidade().equalsIgnoreCase(inicioValidade))
							&& (ll.getFimValidade().equalsIgnoreCase(fimValidade))) {
						svt01.setMarca(marca);
						svt01.setSabor(sabor);
						svt01.setInicioValidade(inicioValidade);
						svt01.setFimValidade(fimValidade);
						svt01.setLote(ll);
						svt01.setPrecoCusto(precoCusto);
						svt01.setPrecoVenda(precoVenda);
						geralDAO.inserir(svt01);
					}
				}
			}
			if (opcaoInserir == 2) {
				System.out.println("Á baixo estão os lotes disponiveis para inserção: ");
				// Só pode inseir um sorvete em um lote específico que tenha a mesma, marca,
				// sabor e validade do sorvete
				Lote lote = new Lote();
				List<Lote> lotes = geralDAO.buscarTodos(lote);
				for (Lote lt : lotes) {
					System.out.println("CódigoLote: " + lt.getCodigoLote() + " Marca " + lt.getMarca() + " Sabor "
							+ lt.getSabor() + " InícioValidade " + lt.getInicioValidade() + " FimValidade "
							+ lt.getFimValidade() + " PreçoCusto " + lt.getCusto() + " PreçoVenda " + lt.getVenda());
				}
				System.out.println(
						"Observe os padrões dos lotes a cima e verifique se o sorvete que está tentando inserir matém os padrões de marca, sabor e validade.");
				System.out.println("Digite a marca do sorvete: ");
				Scanner st1 = new Scanner(System.in);
				String marca = st1.nextLine();
				System.out.println("Digite o sabor do sorvete: ");
				String sabor = st1.nextLine();
				System.out.println("Digite o inicio da validade do sorvete: ");
				String inicioValidade = st1.nextLine();
				System.out.println("Digite o fim da validade do sorvete: ");
				String fimValidade = st1.nextLine();
				System.out.println("Digite o código do lote onde vai inserir o sorvette: ");
				int codigoLote = st1.nextInt();
				double precoCusto = 1;
				double precoVenda = 2;
				Sorvete svt02 = new Sorvete();
				Lote loteIndividual = (Lote) geralDAO.buscarUmObjetoEspecifico(Lote.class, codigoLote);
				if (loteIndividual.getMarca().equalsIgnoreCase(marca)
						&& (loteIndividual.getSabor().equalsIgnoreCase(sabor)
								&& (loteIndividual.getInicioValidade().equalsIgnoreCase(inicioValidade)
										&& (loteIndividual.getFimValidade().equalsIgnoreCase(fimValidade))))) {
					svt02.setMarca(marca);
					svt02.setSabor(sabor);
					svt02.setInicioValidade(inicioValidade);
					svt02.setFimValidade(fimValidade);
					svt02.setLote(loteIndividual);
					svt02.setPrecoCusto(precoCusto);
					svt02.setPrecoVenda(precoVenda);
					geralDAO.inserir(svt02);
				}

			}

			if (opcaoInserir == 3) {
				// Inseri um novo lote:
				Scanner inserirLote = new Scanner(System.in);
				System.out.println("Digite a marca do lote: ");
				String marca = inserirLote.nextLine();
				System.out.println("Informe o sabor do lote: ");
				String sabor = inserirLote.nextLine();
				System.out.println("Digite  início da validade do lote: ");
				String inicioValidade = inserirLote.nextLine();
				System.out.println("Digite  fim da validade do lote: ");
				String fimValidade = inserirLote.nextLine();
				System.out.println("Digite o preco de custo do lote: ");
				double precoCusto = inserirLote.nextDouble();
				System.out.println("Informe o preco de venda do lote: ");
				double precoVenda = inserirLote.nextDouble();

//				String marca = "peixe", sabor = "peixe", inicioValidade = "20/12/2020", fimValidade ="20/03/2021";
//				double precoCusto = 25.00, precoVenda = 50.00;
				Lote lote = new Lote();
				lote.setMarca(marca);
				lote.setSabor(sabor);
				lote.setInicioValidade(inicioValidade);
				lote.setFimValidade(fimValidade);
				lote.setCusto(precoCusto);
				lote.setVenda(precoVenda);
				geralDAO.inserir(lote);
			}
		}
		if (opcao == 3) {
			System.out.println("(Você Escolheu Opções de Deletar)");
			System.out.println("Escolha uma das opções: " + "\n1-Deletar os/o lote/s e sorvete/s vencido/s");
			int opcaoDeletar = scanner.nextInt();
			if (opcaoDeletar == 1) {
				// Deletar os/o lote/s e sorvete/s vencido/s
				// 1º Tem que deletar os sorvetes por causa da/s FK/S
				Sorvete sorvete = new Sorvete();
				List<Sorvete> sorvetes = geralDAO.buscarTodos(sorvete);
				LocalDate hoje = LocalDate.now();
				for (Sorvete s : sorvetes) {
					LocalDate fimDate = LocalDate.parse(s.getFimValidade(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					if (fimDate.isBefore(hoje)) {
						System.out.println(" Sovete vencido! Solicite Remoção Imediatamente! " + " Código do produto: "
								+ s.getCodigoProduto() + " FimValidade " + s.getFimValidade() + " Data de Hoje "
								+ hoje);
						System.out.println(" Deseja inicar a operação 'Delete?' 's/n?'");
						Scanner sorveteVencido = new Scanner(System.in);
						String st = sorveteVencido.nextLine();
						if (st.equalsIgnoreCase("s")) {
							int i = s.getCodigoProduto();
							System.out.println(i);
							geralDAO.remover(Sorvete.class, i);
							System.out.println("pop");
						}
					}
				}

				Lote lote = new Lote();
				List<Lote> lotes = geralDAO.buscarTodos(lote);
				LocalDate hoje1 = LocalDate.now();
				for (Lote l : lotes) {
					LocalDate fimDate = LocalDate.parse(l.getFimValidade(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					if (fimDate.isBefore(hoje1)) {
						System.out.println(" Lote vencido! Solicite Remoção Imediatamente! " + " Código do lote: "
								+ l.getCodigoLote() + " FimValidade " + l.getFimValidade() + " Data de Hoje " + hoje);
						System.out.println(" Deseja inicar a operação 'Delete?' 's/n?'");
						Scanner loteVencido = new Scanner(System.in);
						String s = loteVencido.nextLine();
						if (s.equalsIgnoreCase("s")) {
							int i = l.getCodigoLote();
							System.out.println(i);
							geralDAO.remover(Lote.class, i);
							System.out.println("pop");
						}
					}
				}

			}

		}
	}
}
