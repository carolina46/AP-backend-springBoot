package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.Habilidad;
import java.util.List;

/**
 *
 * @author Carolina Veronica Perez
 */
public interface IHabilidadService {
    
    public Habilidad guardarHabilidad(Habilidad habilidad);
    public List<Habilidad> listarHabilidades();
    public boolean borrarHabilidad(Long id);
    public Habilidad verHabilidad(Long id);
} 