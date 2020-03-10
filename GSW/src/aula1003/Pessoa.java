package aula1003;

public class Pessoa {
	private String nome;
	public Telefone telefone;
	public Endereço endereço;
	
	public Pessoa(String nome, Telefone telefone, Endereço endereço) {
	
		this.nome = nome;
		this.telefone = telefone;
		this.endereço = endereço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	

}
