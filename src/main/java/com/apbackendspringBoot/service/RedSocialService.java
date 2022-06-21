package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.RedSocial;
import com.apbackendspringBoot.repository.RedSocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carolina Veronica Perez
 */

@Service
public class RedSocialService implements IRedSocialService{

    @Autowired
    public RedSocialRepository redSocialRepository;
    
    @Override
    public void guardarRedSocial(RedSocial redSocial) {
        redSocialRepository.save(redSocial);
    }

    @Override
    public List<RedSocial> listarRedSociales() {
        return redSocialRepository.findAll();
    }

    @Override
    public void borrarRedSocial(Long id) {
        redSocialRepository.deleteById(id);
    }

    @Override
    public RedSocial verRedSocial(Long id) {
        return redSocialRepository.findById(id).orElse(null);
    }
    
}
