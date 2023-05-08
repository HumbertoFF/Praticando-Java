package main.java;

import java.util.Comparator;
import java.util.Objects;

public class Series implements Comparable<Series>, Comparator<Series> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Series(String nome, String genero, Integer tempoEpisodio){
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return nome.equals(series.nome) && genero.equals(series.genero) && tempoEpisodio.equals(series.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Series series) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(),series.getTempoEpisodio());
        if(tempoEpisodio != 0) return tempoEpisodio;
        return   this.getGenero().compareTo(series.getGenero());
    }
    @Override
    public int compare(Series o1, Series o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if(nome != 0) return nome;

        int genero = o1.getGenero().compareTo(o2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());
    }
}
