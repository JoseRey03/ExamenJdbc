package org.example;

public class Pelicula {
    private Integer id;
    private String titulo;
    private Integer año;
    private String genero;

    public Pelicula(){}

    public Pelicula(int id, String titulo, int año, String genero){
        this.id = id;
        this.titulo = titulo;
        this.año = año;
        this.genero = genero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public String toString() {
        return "Pelicula [id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", año=" + año + "]";
    }
}

