
package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.AcercaDe;
import com.apbackendspringBoot.repository.AcercaDeRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Carolina veronica Perez
 */
public class AcercaDeService implements IAcercaDeService{
    
    @Autowired
    public AcercaDeRepository acercaDeRepository;

    @Override
    public void guardarAcercaDe(AcercaDe acercaDe) {
        acercaDeRepository.save(acercaDe);
    }

    @Override
    public AcercaDe verAcercaDe(Long id) {
        return acercaDeRepository.findById(id).orElse(null);
    }

}
