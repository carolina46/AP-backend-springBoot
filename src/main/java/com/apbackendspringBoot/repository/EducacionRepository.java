package com.apbackendspringBoot.repository;

import com.apbackendspringBoot.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carolina Veronica Perez
 */

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long> {
    
}
