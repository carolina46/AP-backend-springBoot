package com.apbackendspringBoot.controller;

import com.apbackendspringBoot.model.Educacion;
import com.apbackendspringBoot.model.Experiencia;
import com.apbackendspringBoot.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
 * @author Carolina Veronica Perez
 */

@RestController
@CrossOrigin
public class EducacionController {
    
    @Autowired
    private IEducacionService  educacionService;   
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/editarPortfolio/educacion/agregar")
    public Educacion guardarEducacion(@RequestBody Educacion educacion) {
        return educacionService.guardarEducacion(educacion);
    }

    @GetMapping("/portfolio/educacion")
    @ResponseBody
    public List<Educacion> listarEducacion() {
        return educacionService.listarEducacion();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/editarPortfolio/educacion/eliminar/{id}")
    public boolean deleteById(@PathVariable("id") Long id) {
        return educacionService.borrarEducacion(id);

    }

}
