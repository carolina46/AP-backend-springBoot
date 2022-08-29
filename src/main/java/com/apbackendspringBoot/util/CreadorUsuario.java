
package com.apbackendspringBoot.util;

import com.apbackendspringBoot.security.enums.RolNombre;
import com.apbackendspringBoot.security.model.Rol;
import com.apbackendspringBoot.security.model.Usuario;
import com.apbackendspringBoot.security.service.RolService;
import com.apbackendspringBoot.security.service.UsuarioService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Carolina veronica Perez
 */
public class CreadorUsuario implements CommandLineRunner {

    @Autowired
    RolService rolService;
    @Autowired
    UsuarioService usuarioService;
     @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
       
        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
        
        
        Usuario usuario = new Usuario("ap-cvp-2022", passwordEncoder.encode("ap-cvp-2022"));
        Set<Rol> roles = new HashSet<>();
        roles.add(rolService.getByRolNombre(RolNombre.ROLE_USER).get());
        roles.add(rolService.getByRolNombre(RolNombre.ROLE_ADMIN).get());
        usuario.setRoles(roles);
        usuarioService.save(usuario);
        
        
        
    }
}