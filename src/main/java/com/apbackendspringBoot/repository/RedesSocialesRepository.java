package com.apbackendspringBoot.repository;

import com.apbackendspringBoot.model.RedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carolina Veronica Perez
 */

@Repository
public interface RedSocialRepository extends JpaRepository <RedSocial, Long> {}
