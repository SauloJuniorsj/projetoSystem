package projetoSystem;

import java.util.Date;
import java.util.List;

public class notaFiscal {

	private long numero;
	private Date data;
	private long chave;
	private long cnpjEmissor;
	private String emissor;
	private String cliente;
	private List<Produto> produtos;
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public long getChave() {
		return chave;
	}
	public void setChave(long chave) {
		this.chave = chave;
	}
	public long getCnpjEmissor() {
		return cnpjEmissor;
	}
	public void setCnpjEmissor(long cnpjEmissor) {
		this.cnpjEmissor = cnpjEmissor;
	}
	public String getEmissor() {
		return emissor;
	}
	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
}
