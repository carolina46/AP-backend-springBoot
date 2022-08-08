package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.Experiencia;
import com.apbackendspringBoot.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carolina Veronica Perez
 */

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public ExperienciaRepository experienciaRepository;
    
    @Override
    public Experiencia guardarExperiencia(Experiencia experiencia) {
       return  experienciaRepository.save(experiencia);
    }

    @Override
    public List<Experiencia> listarExperiencias() {
        return experienciaRepository.findAll();
    }

    @Override
    public boolean borrarExperiencia(Long id) {
        experienciaRepository.deleteById(id);
        return verExperiencia(id)==null;
    }

    @Override
    public Experiencia verExperiencia(Long id) {
        return experienciaRepository.findById(id).orElse(null);
    }
}
