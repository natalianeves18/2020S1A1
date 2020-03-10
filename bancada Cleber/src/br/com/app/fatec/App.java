package br.com.app.fatec;

import br.com.modelo.fatec.*;
import java.util.ArrayList;

import br.com.negocio.fatec.AsciiArt;
import br.com.negocio.fatec.Controle;
import br.com.negocio.fatec.Menu;

import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		ArrayList<Pessoa> contatos = new ArrayList<Pessoa>();
		AsciiArt.printAsciiArt("Serasa");
		Menu menu = new Menu();
		Scanner input = new Scanner(System.in);
		int op = 1000;
		while (op != 0) {
			menu.imprimirMenu();
			op = input.nextInt();
			switch (op) {
			case 1:
				String nome = input.next();
				contatos.add(new Pessoa(nome));
				break;

			case 2:
				for(Pessoa pessoa: contatos) {
					System.out.println(pessoa.getNome());
				}
			default:
				menu.imprimirMenu();
				break;
			}
		}
		input.close();
	}
}







