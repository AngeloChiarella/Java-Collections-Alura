package br.com.alura.testes;

import java.util.Iterator;
import java.util.Set;

import br.com.alura.entidades.Aluno;
import br.com.alura.entidades.Aula;
import br.com.alura.entidades.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);

		System.out.println("Todos os alunos matriculados: ");

//		Forma antiga de percorrer uma lista
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while (iterador.hasNext()) { // saber se tem um proximo obj)
			Aluno proximo = iterador.next(); // Retornar o proximo
			System.out.println(proximo);
		}

//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a.toString());
//		});

		System.out.println("O Aluno " + a1.getNome() + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));

		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));

		System.out.println("O a1 == turini? " + (a1 == turini) + " (o mesmo)");
		System.out.println("O a1 .equals turini? " + (a1.equals(turini)) + " (igual personalizado)");
//		Se quiser obter objetos iguais, e nao o mesmo, rescrever o metodo "equals" na classe do obj.

//		Obrigatoriamente o seguinte e true (Tem o mesmo codigo de espalhamento)
		System.out.println(a1.hashCode() == turini.hashCode());

	}

}
