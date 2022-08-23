package com.apbackendspringBoot.controller;

import com.apbackendspringBoot.model.AcercaDe;
import com.apbackendspringBoot.service.IAcercaDeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
public class AcercaDeController {

    @Autowired
    private IAcercaDeService acercaDeService;

    @GetMapping("/portfolio/acercaDe")
    @ResponseBody
    public AcercaDe obtenerAcercaDe() {
        return acercaDeService.verAcercaDe();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/editarPortfolio/acercaDe/guardar")
    public boolean guardarAcercaDe(@RequestBody AcercaDe acercaDe) {
       return acercaDeService.guardarAcercaDe(acercaDe);
    }

}
