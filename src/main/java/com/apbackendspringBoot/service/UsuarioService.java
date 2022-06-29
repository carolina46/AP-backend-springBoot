
package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.Usuario;
import com.apbackendspringBoot.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carolina veronica Perez
 */
@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    public UsuarioRepository usuarioRepository;

    @Override
    public Usuario verUsuario(String nombre, String clave) {
        Long id = new Long(1);
        return usuarioRepository.findById(id).orElse(null);
    }

}