package com.apbackendspringBoot.controller;

import com.apbackendspringBoot.model.Experiencia;
import com.apbackendspringBoot.service.IExperienciaService;
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
 * bpdpmgudi1fs2wlxxxya-mysql.services.clever-cloud.com
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/experiencia/")
public class ExperienciaController {

    @Autowired
    private IExperienciaService experienciaService;

    @PostMapping("/agregar")
    public Experiencia agregarExperiencia(@RequestBody Experiencia experiencia) {
        return experienciaService.guardarExperiencia(experiencia);
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Experiencia> listarExperiencia() {
        return experienciaService.listarExperiencias();
    }

    @DeleteMapping("/eliminar/{id}")
    public boolean deleteById(@PathVariable("id") Long id) {
        return experienciaService.borrarExperiencia(id);

    }

}
