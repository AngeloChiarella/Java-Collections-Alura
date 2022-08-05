package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.entidades.Aula;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 15);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 20);

		ArrayList<Aula> aulas = new ArrayList<>();

		aulas.addAll(Arrays.asList(a1, a2, a3));

		Collections.sort(aulas);
		System.out.println(aulas);

		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);

		aulas.sort(Comparator.comparing(Aula::getTempo));

	}

}
