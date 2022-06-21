package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.Experiencia;
import java.util.List;

/**
 *
 * @author Carolina Veronica Perez
 */
public interface IExperienciaService {
    
    public void guardarExperiencia(Experiencia experiencia);
    public List<Experiencia> listarExperiencias();
    public void borrarExperiencia(Long id);
    public Experiencia verExperiencia(Long id);
}
