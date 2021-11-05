package controller;

import listaEncadeada.ListaEncadedaSimples;
import listaEncadeada.No;

public class ListaBuilder {

	int TamanhoLista1 = 0;
	int TamanhoLista2 = 0;

	ListaEncadedaSimples lista1 = new ListaEncadedaSimples();
	ListaEncadedaSimples lista2 = new ListaEncadedaSimples();
	ListaEncadedaSimples lista3 = new ListaEncadedaSimples();

	public void gerarlista(int qtdnumeros) {
		for (int i = 0; i < qtdnumeros; i++) {
			int valor = (int) (Math.random() * 101);
			System.out.println("Numero aleatorio gerado ==> " + valor);
			if (i % 2 == 0) {
				if (i == 0) {
					lista1.adicionaPrimeiroElemento(new No(Integer.toString(valor)));
				} else {
					lista1.adicionaElemento(new No(Integer.toString(valor)));
				}
				TamanhoLista1++;
				System.out.println("Numero " + i + " Adicionado na lista 1");
			} else {
				if (i == 1) {
					lista2.adicionaPrimeiroElemento(new No(Integer.toString(valor)));
				} else {
					lista2.adicionaElemento(new No(Integer.toString(valor)));
				}
				TamanhoLista2++;
				System.out.println("Numero " + i + " Adicionado na lista 2");
			}
		}
		System.out.println("Lista 1 " + lista1.toString());
		System.out.println("Lista 2 " + lista2.toString());
	}

	public void criar_unica_lista() {
		System.out.println("Chegou");
		int TamanhoLista3 = TamanhoLista1 + TamanhoLista2;
		// for (int j = 0; j < TamanhoLista3; j++) {
		for (int j = 0; j < TamanhoLista1; j++) {
			if (j == 0) {
				lista3.adicionaPrimeiroElemento(new No(lista1.pegaElemento(j)));
			} else {
				lista3.adicionaElemento(new No(lista1.pegaElemento(j)));
			}
		}
		for (int j = 0; j < TamanhoLista2; j++) {

			lista3.adicionaElemento(new No(lista2.pegaElemento(j)));
		}
		System.out.println("Lista 3 " + lista3.toString());
	}
}
