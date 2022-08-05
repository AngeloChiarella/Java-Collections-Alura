package br.com.alura.entidades;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();
	private Set<Aluno> alunos = new HashSet<>();
//	LinkedHashSet: ordena conforme adicionado
//	TreeSet: Só funciona para classes que sao comparable

	private Map<Integer, Aluno> matriculaParaAluno = new LinkedHashMap<>();
//	Mapear obj com numero (Para cada matricula há um aluno) {CHAVE, VALOR}
//	LinkedHashMap: ordena na medida que for adicionado

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
		// unmodifiableList impede modificações ou ordenações, mantendo a ordem natural
		// dos objs
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", aulas: " + this.aulas + "]";
	}

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);

	}

	public int getTempoTotal() {// soma o tempo total das aulas igual metodo abaixo
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int matricula) {
		if (!matriculaParaAluno.containsKey(matricula))
			throw new NoSuchElementException("Matricula não encontrada: " + matricula);

		return matriculaParaAluno.get(matricula);

	}

//	public Aluno buscaMatriculado(int matricula) {
//		for (Aluno aluno : alunos) {
//			if (aluno.getNumeroMatricula() == matricula) {
//				return aluno;
//			}
//		}
//		throw new NoSuchElementException("Matricula não encontrada: " + matricula);
//	}

//	public int getTempoTotal() {
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
//	}

}
