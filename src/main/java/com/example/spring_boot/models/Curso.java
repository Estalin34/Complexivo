package com.example.spring_boot.models;


import jakarta.persistence.*;

@Entity(name = "cursos")
public class Curso {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String nombre;
    private  String duracion;
    private int precio;
    private  String categoriacurso;
    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private CategoriaCurso categoriaCurso;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoriacurso() {
        return categoriacurso;
    }

    public void setCategoriacurso(String categoriacurso) {
        this.categoriacurso = categoriacurso;
    }


    public CategoriaCurso getCategoriaCurso() {
        return categoriaCurso;
    }

    public void setCategoriaCurso(CategoriaCurso categoriaCurso) {
        this.categoriaCurso = categoriaCurso;
    }
}
