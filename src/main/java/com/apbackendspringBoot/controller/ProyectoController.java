
package com.apbackendspringBoot.controller;

import com.apbackendspringBoot.model.Proyecto;
import com.apbackendspringBoot.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carolina veronica Perez
 */
@RestController
@CrossOrigin
public class ProyectoController {
    
    @Autowired
    private IProyectoService proyectoService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/editarPortfolio/proyecto/agregar")
    public Proyecto agregarProyecto(@RequestBody Proyecto proyecto) {
        return proyectoService.guardarProyecto(proyecto);
    }

    @GetMapping("/portfolio/proyectos")
    @ResponseBody
    public List<Proyecto> listarProyectos() {
        return proyectoService.listarProyectos();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/editarPortfolio/proyecto/eliminar/{id}")
    public boolean deleteById(@PathVariable("id") Long id) {
        return proyectoService.borrarProyecto(id);

    }

}
