package com.nortec.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nortec.escola.modelo.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Long>{
    
}
