
package com.apbackendspringBoot.controller;
import com.apbackendspringBoot.model.Habilidad;
import com.apbackendspringBoot.service.IHabilidadService;
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
@RequestMapping(value = "/habilidad/")
public class HabilidadController {
    
    @Autowired
    private IHabilidadService habilidadService;

    @PostMapping("/agregar")
    public Habilidad agregarHabilidad(@RequestBody Habilidad habilidad) {
        return habilidadService.guardarHabilidad(habilidad);
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Habilidad> listarHabilidades() {
        return habilidadService.listarHabilidades();
    }

    @DeleteMapping("/eliminar/{id}")
    public boolean deleteById(@PathVariable("id") Long id) {
        return habilidadService.borrarHabilidad(id);

    }

}

