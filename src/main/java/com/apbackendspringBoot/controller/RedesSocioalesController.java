
package com.apbackendspringBoot.controller;

import com.apbackendspringBoot.model.RedesSociales;
import com.apbackendspringBoot.service.IRedesSocialesService;
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
@RequestMapping(value = "/redesSociales/")
@CrossOrigin(origins = "http://localhost:4200")
public class RedesSocioalesController {
    
    @Autowired
    private IRedesSocialesService redesSocialesService;

    @GetMapping("/obtener")
    @ResponseBody
    public RedesSociales obtenerAcercaDe() {
        return redesSocialesService.verRedesSociales();
    }

    @PostMapping("/guardar")
    public RedesSociales guardarAcercaDe(@RequestBody RedesSociales redesSociales) {
       return redesSocialesService.guardarRedesSociales(redesSociales);
    }

}
