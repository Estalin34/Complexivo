package com.example.spring_boot.repository;

import com.example.spring_boot.models.Curso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository <Curso,Long> {
}
