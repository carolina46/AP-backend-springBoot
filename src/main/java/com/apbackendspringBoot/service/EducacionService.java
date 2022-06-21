package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.Educacion;
import com.apbackendspringBoot.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carolina Veronica Perez
 */

@Service
public class EducacionService implements IEducacionService{

    @Autowired
    public EducacionRepository educacionRepository;
    
    @Override
    public void guardarEducacion(Educacion educacion) {
        educacionRepository.save(educacion);
    }

    @Override
    public List<Educacion> listarEducacion() {
        return educacionRepository.findAll();
    }

    @Override
    public void borrarEducacion(Long id) {
        educacionRepository.deleteById(id);
    }

    @Override
    public Educacion verEducacion(Long id) {
        return educacionRepository.findById(id).orElse(null);
    }
    
}
