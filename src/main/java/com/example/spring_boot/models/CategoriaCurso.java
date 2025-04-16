package com.example.spring_boot.models;

import jakarta.persistence.*;

import java.util.List;


@Entity(name = "categorias")
public class CategoriaCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String nombre;
    private String descripción;
    @OneToMany(mappedBy = "categoriaCurso", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Curso> cursos;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
