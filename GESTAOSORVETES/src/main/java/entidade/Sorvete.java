package entidade;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SORVETE")
public class Sorvete {
	@Id
	@Column(name = "CODIGO_PRODUTO", nullable = false)
	@GeneratedValue(generator = "S_CODIGO_PRODUTO")
	@SequenceGenerator(name = "S_CODIGO_PRODUTO", sequenceName = "S_CODIGO_PRODUTO", allocationSize = 1)
	int codigoProduto;
	
	@Column(name = "MARCA", nullable = false, length = 100)
	String marca;
	
	@Column(name = "SABOR", nullable = false, length = 100)
	String sabor;
	
	@Column(name = "INICIO_VALIDADE", nullable = false, length = 100)
	String inicioValidade;
	
	@Column(name = "FIM_VALIDADE", nullable = false, length =100)
	String fimValidade;
	
	@ManyToOne 
	@JoinColumn(name = "CODIGO_LOTE_SORVETE", referencedColumnName = "CODIGO_LOTE", nullable = false)
	Lote lote;
	
	@Column(name = "PRECO_CUSTO", nullable = false)
	double precoCusto;
	
	@Column(name = "PRECO_VENDA", nullable = false)
	double precoVenda;

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getInicioValidade() {
		return inicioValidade;
	}

	public void setInicioValidade(String inicioValidade) {
		this.inicioValidade = inicioValidade;
	}

	public String getFimValidade() {
		return fimValidade;
	}

	public void setFimValidade(String fimValidade) {
		this.fimValidade = fimValidade;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	
}
