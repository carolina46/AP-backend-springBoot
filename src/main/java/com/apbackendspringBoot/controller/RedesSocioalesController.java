
package com.apbackendspringBoot.controller;

import com.apbackendspringBoot.model.RedesSociales;
import com.apbackendspringBoot.service.IRedesSocialesService;
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
public class RedesSocioalesController {
    
    @Autowired
    private IRedesSocialesService redesSocialesService;

    @GetMapping("/portfolio/redesSociales")
    @ResponseBody
    public RedesSociales obtenerAcercaDe() {
        return redesSocialesService.verRedesSociales();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/editarPortfolio/redesSociales/guardar")
    public RedesSociales guardarAcercaDe(@RequestBody RedesSociales redesSociales) {
       return redesSocialesService.guardarRedesSociales(redesSociales);
    }

}
