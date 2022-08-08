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
    public Educacion guardarEducacion(Educacion educacion) {
        return educacionRepository.save(educacion);
    }

    @Override
    public List<Educacion> listarEducacion() {
        return educacionRepository.findAll();
    }

    @Override
    public boolean borrarEducacion(Long id) {
        educacionRepository.deleteById(id);
        return verEducacion(id)==null;
    }

    @Override
    public Educacion verEducacion(Long id) {
        return educacionRepository.findById(id).orElse(null);
    }
    
}
