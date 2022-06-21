package com.apbackendspringBoot.service;
import com.apbackendspringBoot.model.AcercaDe;

/**
 *
 * @author Carolina Veronica Perez
 */

public interface IAcercaDeService {
    
    public void guardarAcercaDe(AcercaDe acercaDe);
    public AcercaDe verAcercaDe(Long id);
}

