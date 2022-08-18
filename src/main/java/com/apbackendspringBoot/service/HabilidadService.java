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
    public Habilidad guardarHabilidad(Habilidad habilidad) {
        return habilidadRepository.save(habilidad);
    }

    @Override
    public List<Habilidad> listarHabilidades() {
        return habilidadRepository.findAll();
    }

    @Override
    public boolean borrarHabilidad(Long id) {
        habilidadRepository.deleteById(id);
        return verHabilidad(id) == null;
    }

    @Override
    public Habilidad verHabilidad(Long id) {
        return habilidadRepository.findById(id).orElse(null);
    }
    
}
