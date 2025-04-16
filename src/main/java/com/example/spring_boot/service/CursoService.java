package com.example.spring_boot.service;

import com.example.spring_boot.models.Curso;
import com.example.spring_boot.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CursoService {

    @Autowired
    CursoRepository cursoRepository;


    public Curso saveCurso(Curso product){
        return cursoRepository.save(product);
    }


    public List<Curso> getAllCurso(){
        return cursoRepository.findAll();
    }


    public Optional<Curso> getCursotById(Long id){
        return cursoRepository.findById(id);
    }


    public void deleteCurso(Long id){
        cursoRepository.deleteById(id);
    }

}

