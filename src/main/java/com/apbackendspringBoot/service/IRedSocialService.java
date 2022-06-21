package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.RedSocial;
import java.util.List;

/**
 *
 * @author Carolina Veronica Perez
 */
public interface IRedSocialService {
    
    public void guardarRedSocial(RedSocial redSocial);
    public List<RedSocial> listarRedSociales();
    public void borrarRedSocial(Long id);
    public RedSocial verRedSocial(Long id);
}