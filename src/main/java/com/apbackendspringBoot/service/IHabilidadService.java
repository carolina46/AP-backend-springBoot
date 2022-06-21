package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.Habilidad;
import java.util.List;

/**
 *
 * @author Carolina Veronica Perez
 */
public interface IHabilidadService {
    
    public void guardarHabilidad(Habilidad habilidad);
    public List<Habilidad> listarHabilidades();
    public void borrarHabilidad(Long id);
    public Habilidad verHabilidad(Long id);
} 