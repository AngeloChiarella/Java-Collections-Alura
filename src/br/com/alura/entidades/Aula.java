package br.com.alura.entidades;

public class Aula implements Comparable<Aula> {

	private String titulo;
	private int tempo;

//	ATALHO: "CTRL + 3 -> gcuf"
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "[Aula: " + titulo + ", " + tempo + " minutos]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}

}
