package view;

import javax.swing.JOptionPane;

import controller.ListaBuilder;


public class Principal {

	public static void main(String[] args) {

		ListaBuilder Builder = new ListaBuilder();
		int qtdnumeros = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros aleatorios serão gerados ? "));
		Builder.gerarlista(qtdnumeros);
		Builder.criar_unica_lista();
	}
}
