package com.apbackendspringBoot.controller;

import com.apbackendspringBoot.model.Experiencia;
import com.apbackendspringBoot.service.IExperienciaService;
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
 * @author Carolina veronica Perez
 * bpdpmgudi1fs2wlxxxya-mysql.services.clever-cloud.com
 */
@RestController
@CrossOrigin
public class ExperienciaController {

    @Autowired
    private IExperienciaService experienciaService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/editarPortfolio/experiencia/agregar")
    public Experiencia agregarExperiencia(@RequestBody Experiencia experiencia) {
        return experienciaService.guardarExperiencia(experiencia);
    }

    @GetMapping("/portfolio/experiencia")
    @ResponseBody
    public List<Experiencia> listarExperiencia() {
        return experienciaService.listarExperiencias();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/editarPortfolio/experiencia/eliminar/{id}")
    public boolean deleteById(@PathVariable("id") Long id) {
        return experienciaService.borrarExperiencia(id);

    }

}
