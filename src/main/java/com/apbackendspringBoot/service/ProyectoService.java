
package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.Proyecto;
import com.apbackendspringBoot.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carolina Veronica Perez
 */

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    public ProyectoRepository proyectoRepository;
    
    @Override
    public Proyecto guardarProyecto(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    @Override
    public List<Proyecto> listarProyectos() {
        return proyectoRepository.findAll();
    }

    @Override
    public boolean borrarProyecto(Long id) {
        proyectoRepository.deleteById(id);
        return verProyecto(id) == null;
    }

    @Override
    public Proyecto verProyecto(Long id) {
        return proyectoRepository.findById(id).orElse(null);
    }
    
}

