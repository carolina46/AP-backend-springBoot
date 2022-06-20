package com.apbackendspringBoot.repository;

import com.apbackendspringBoot.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carolina Veronica Perez
 */

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long> {
    
}