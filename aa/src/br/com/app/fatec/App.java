package br.com.app.fatec;

import br.com.negocio.fatec.AsciiArt;
import br.com.negocio.fatec.Controle;
import br.com.negocio.fatec.Menu;

public class App {
	public static void main(String[] args) {
		AsciiArt.printAsciiArt("Serasa");
		Menu menu = new Menu();
		int op = 1000;
		while (op != 0) {
			menu.imprimirMenu();
			Controle ctl = new Controle();
			op = ctl.opcao();
			switch (op) {
			case 1:
				// Aqui que voces vão se virar nos 30
				break;

			default:
				menu.imprimirMenu();
				break;
			}
		}

	}
}







