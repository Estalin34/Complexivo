package com.example.spring_boot.repository;

import com.example.spring_boot.models.CategoriaCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaCursoRepository extends JpaRepository<CategoriaCurso,Long> {
}
