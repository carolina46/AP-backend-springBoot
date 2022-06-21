package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.Educacion;
import java.util.List;

/**
 *
 * @author Carolina Veronica Perez
 */
public interface IEducacionService {
    
    public void guardarEducacion(Educacion educacion);
    public List<Educacion> listarEducacion();
    public void borrarEducacion(Long id);
    public Educacion verEducacion(Long id);
}
