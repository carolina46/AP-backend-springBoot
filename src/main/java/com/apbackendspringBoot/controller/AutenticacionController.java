
package com.apbackendspringBoot.controller;

import com.apbackendspringBoot.model.Usuario;
import com.apbackendspringBoot.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carolina veronica Perez
 */
@RestController
@RequestMapping(value = "/autenticacion/")
@CrossOrigin(origins = "http://localhost:4200")
public class AutenticacionController {

    @Autowired
    private IUsuarioService usuarioService;
    
    @PostMapping("/")
    public boolean guardarAcercaDe(@RequestBody Usuario usuario) {
       return usuarioService.comprobarUsuario(usuario);
    }
}
