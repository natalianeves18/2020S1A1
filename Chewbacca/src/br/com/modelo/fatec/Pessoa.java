package br.com.modelo.fatec;

public class Pessoa {
	private String nome;

	
	public Pessoa(String nome) {
		this.nome = nome;
		
	}

	@Override
	public String toString() {
		String info = ""+nome;
		return info;
	}
}
