package com.apbackendspringBoot.repository;

import com.apbackendspringBoot.model.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carolina Veronica Perez
 */

@Repository
public interface AcercaDeRepository extends JpaRepository <AcercaDe, Long> {}
    