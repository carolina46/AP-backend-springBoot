package com.apbackendspringBoot.repository;

import com.apbackendspringBoot.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carolina Veronica Perez
 */

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, String> {
    
}