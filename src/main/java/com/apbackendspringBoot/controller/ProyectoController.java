
package com.apbackendspringBoot.controller;

import com.apbackendspringBoot.model.Proyecto;
import com.apbackendspringBoot.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carolina veronica Perez
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/proyecto/")
public class ProyectoController {
    
    @Autowired
    private IProyectoService proyectoService;

    @PostMapping("/agregar")
    public Proyecto agregarProyecto(@RequestBody Proyecto proyecto) {
        return proyectoService.guardarProyecto(proyecto);
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Proyecto> listarProyectos() {
        return proyectoService.listarProyectos();
    }

    @DeleteMapping("/eliminar/{id}")
    public boolean deleteById(@PathVariable("id") Long id) {
        return proyectoService.borrarProyecto(id);

    }

}
