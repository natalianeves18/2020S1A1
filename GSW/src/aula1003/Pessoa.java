package aula1003;

public class Pessoa {
	private String nome;
	public Telefone telefone;
	public Endere�o endere�o;
	
	public Pessoa(String nome, Telefone telefone, Endere�o endere�o) {
	
		this.nome = nome;
		this.telefone = telefone;
		this.endere�o = endere�o;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	

}
