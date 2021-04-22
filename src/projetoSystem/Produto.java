package projetoSystem;

public class Produto {

	private long id;
	private String nome;
	private String descr;
	private long qtdade;
	private float valor;
	
	public Produto(long id, String nome, String descr, long qtd, float valor){
		this.id = id;
		this.nome = nome;
		this.descr = descr;
		this.qtdade = qtd;
		this.valor = valor;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getQtdade() {
		return qtdade;
	}
	public void setQtdade(long qtdade) {
		this.qtdade = qtdade;
	}
	
}
