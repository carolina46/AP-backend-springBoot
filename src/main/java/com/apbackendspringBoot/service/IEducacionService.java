package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.Educacion;
import java.util.List;

/**
 *
 * @author Carolina Veronica Perez
 */
public interface IEducacionService {
    
    public Educacion guardarEducacion(Educacion educacion);
    public List<Educacion> listarEducacion();
    public boolean borrarEducacion(Long id);
    public Educacion verEducacion(Long id);
}
