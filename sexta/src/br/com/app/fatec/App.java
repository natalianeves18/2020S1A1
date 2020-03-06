package br.com.app.fatec;

import java.util.ArrayList;

import br.com.modelo.fatec.Pessoa;
import br.com.negocio.fatec.AsciiArt;
import br.com.negocio.fatec.Controle;
import br.com.negocio.fatec.Menu;

public class App {
	public static void main(String[] args) {
		AsciiArt.printAsciiArt("hoje é sexta");
		Menu menu = new Menu();
		int op = 1000;
		ArrayList<Pessoa> contatos = new ArrayList();
		
		while (op != 0) {
			menu.imprimirMenu();
			Controle ctl = new Controle();
			op = ctl.opcao();
			switch (op) {
			case 1:
				// Aqui que voces vão se virar nos 30
				ctl = new Controle();
				System.out.println("Digite o nome do novo contato: ");
				String novo_contato = ctl.texto();
				Pessoa p = new Pessoa(novo_contato);
				contatos.add(p);
				break;
			
			case 2:
				ctl = new Controle();
				for (Pessoa j : contatos) {
					System.out.println(j.info());
				}
				break;
			default:
				menu.imprimirMenu();
				break;
			}
		}

	}
}







