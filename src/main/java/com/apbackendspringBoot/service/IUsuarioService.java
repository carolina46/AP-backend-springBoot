package com.apbackendspringBoot.service;
import com.apbackendspringBoot.model.Usuario;

/**
 *
 * @author Carolina Veronica Perez
 */

public interface IUsuarioService {
    
    public Usuario verUsuario(String nombre, String clave);
    
}
