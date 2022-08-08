package com.apbackendspringBoot.controller;

import com.apbackendspringBoot.model.AcercaDe;
import com.apbackendspringBoot.service.IAcercaDeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping(value = "/acercaDe/")
@CrossOrigin(origins = "http://localhost:4200")
public class AcercaDeController {

    @Autowired
    private IAcercaDeService acercaDeService;

    @GetMapping("/obtener")
    @ResponseBody
    public AcercaDe obtenerAcercaDe() {
        return acercaDeService.verAcercaDe();
    }

    @PostMapping("/guardar")
    public boolean guardarAcercaDe(@RequestBody AcercaDe acercaDe) {
       return acercaDeService.guardarAcercaDe(acercaDe);
    }

}
