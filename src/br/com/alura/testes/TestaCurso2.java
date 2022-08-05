package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.entidades.Aula;
import br.com.alura.entidades.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
//		clona a coleção para manipular utilizando 'for'
//		no caso ordenando em ordem alfabetica
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal() + " minutos");
		System.out.println(javaColecoes);
		
	}

}
