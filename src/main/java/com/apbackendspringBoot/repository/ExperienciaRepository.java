package com.apbackendspringBoot.repository;

import com.apbackendspringBoot.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carolina Veronica Perez
 */

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long> {
    
}