package br.com.guilherme.java.collections.models;

public class Aula implements Comparable<Aula> {
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo * 60;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTempo() {
        return tempo / 60;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo * 60;
    }

    @Override
    public String toString() {
        return "[Aula com tempo: " + this.getTempo() + ", titulo " + titulo + "]";
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.getTitulo());

    }
}
