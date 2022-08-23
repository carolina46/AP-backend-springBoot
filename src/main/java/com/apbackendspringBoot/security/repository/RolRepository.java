package com.apbackendspringBoot.security.repository;

import com.apbackendspringBoot.security.enums.RolNombre;
import com.apbackendspringBoot.security.model.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carolina veronica Perez
 */


@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}