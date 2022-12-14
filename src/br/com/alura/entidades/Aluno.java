package br.com.alura.entidades;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome n?o pode ser nulo!");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override // definir se os objetos sao iguais fazendo a propria regra
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.getNome());
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", Matricula: " + this.numeroMatricula + "]";
	}

}
