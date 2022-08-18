package com.apbackendspringBoot.repository;

import com.apbackendspringBoot.model.RedesSociales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carolina Veronica Perez
 */

@Repository
public interface RedesSocialesRepository extends JpaRepository <RedesSociales, Long> {}
