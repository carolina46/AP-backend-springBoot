package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.Proyecto;
import java.util.List;

/**
 *
 * @author Carolina Veronica Perez
 */
public interface IProyectoService {
    
    public void guardarProyecto(Proyecto proyecto);
    public List<Proyecto> listarProyectos();
    public void borrarProyecto(Long id);
    public Proyecto verProyecto(Long id);
}