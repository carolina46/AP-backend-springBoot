package com.apbackendspringBoot.controller;

import com.apbackendspringBoot.model.Educacion;
import com.apbackendspringBoot.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carolina Veronica Perez
 */

@RestController
public class controller {
    
    @Autowired
    private IEducacionService  educacionService;   
    
    @PostMapping ("/crear/educacion")
    public void agregarEducacion(@RequestBody Educacion educacion){
        educacionService.guardarEducacion(educacion);
    }
    
    @GetMapping ("/listar/educacion")
    @ResponseBody
    public List<Educacion> listarEducacion(){
       return educacionService.listarEducacion();
    }
    
    
}
