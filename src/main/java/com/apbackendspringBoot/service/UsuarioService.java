
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
    public boolean comprobarUsuario(Usuario usuario) {
        Usuario u = usuarioRepository.findById(usuario.getNombreUsuario()).orElse(null);
        if(u!=null){
            return u.getClave().equals(usuario.getClave());
        }
        else{
            return false;
        }
    }

}