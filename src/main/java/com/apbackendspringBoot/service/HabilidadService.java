package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.Habilidad;
import com.apbackendspringBoot.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carolina Veronica Perez
 */

@Service
public class HabilidadService implements IHabilidadService{

    @Autowired
    public HabilidadRepository habilidadRepository;
    
    @Override
    public void guardarHabilidad(Habilidad habilidad) {
        habilidadRepository.save(habilidad);
    }

    @Override
    public List<Habilidad> listarHabilidades() {
        return habilidadRepository.findAll();
    }

    @Override
    public void borrarHabilidad(Long id) {
        habilidadRepository.deleteById(id);
    }

    @Override
    public Habilidad verHabilidad(Long id) {
        return habilidadRepository.findById(id).orElse(null);
    }
    
}
