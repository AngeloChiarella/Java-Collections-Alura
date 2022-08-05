package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		String aula4 = "Aumentando nosso conhecimento";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.addAll(Arrays.asList(aula1, aula2, aula3, aula4));

		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		for (String aula : aulas) {

			System.out.println("Aula: " + aula);
		}

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}

		aulas.forEach(aula -> {
			System.out.println("Percorrendo: ");
			System.out.println("Aula: " + aula);
		});
		
		Collections.sort(aulas);
		System.out.println(aulas);
	}

}
