package br.com.alura.testes;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

//		Não ordena os elementos, necessário usar ForEach
//		Vantagem: nao aceita elementos repitidos
//				  usa tabela de espalhamento sem ordem porém filtra mais rapido
		Set<String> alunos = new HashSet<>();

		alunos.add("Angelo Chiarella");
		alunos.add("Alberto Souza");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);


		System.out.println(alunos.size());

//		for (String aluno : alunos) {
//			System.out.println(aluno);
//		}

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println(alunos);
	}

}
