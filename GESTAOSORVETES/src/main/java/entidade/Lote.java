package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "LOTE")
public class Lote {
	@Id
	@Column(name = "CODIGO_LOTE", nullable = false)
	@GeneratedValue(generator = "S_CODIGO_LOTE")
	@SequenceGenerator(name = "S_CODIGO_LOTE", sequenceName = "S_CODIGO_LOTE", allocationSize = 1)
	int codigoLote;
	
	@Column(name = "MARCA", nullable = false, length = 100)
	String marca;
	
	@Column(name = " SABOR", nullable = false, length = 100)
	String sabor;
	
	@Column(name = "INICIO_VALIDADE", nullable = false, length = 100)
	String inicioValidade;
	
	@Column(name = "FIM_VALIDADE", nullable = false, length = 100)
	String fimValidade;
	
	@Column(name = "PRECO_CUSTO", nullable = false)
	double custo;
	
	@Column(name = "PRECO_VENDA", nullable = false, length = 100 )
	double venda;

	public int getCodigoLote() {
		return codigoLote;
	}

	public void setCodigoLote(int codigoLote) {
		this.codigoLote = codigoLote;
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

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}

	
}
