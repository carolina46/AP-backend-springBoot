package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.RedesSociales;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apbackendspringBoot.repository.RedesSocialesRepository;

/**
 *
 * @author Carolina Veronica Perez
 */
@Service
public class RedesSocialesService implements IRedesSocialesService {

    @Autowired
    public RedesSocialesRepository redesSocialesRepository;

    @Override
    public RedesSociales guardarRedesSociales(RedesSociales redSocial) {
        List<RedesSociales> listaRedesSociales = redesSocialesRepository.findAll();
        if (!listaRedesSociales.isEmpty()) {
            Long id = listaRedesSociales.get(0).getId();
            redSocial.setId(id);
        }
        return redesSocialesRepository.save(redSocial);
    }

    @Override
    public RedesSociales verRedesSociales() {
        List<RedesSociales> listaRedesSociales = redesSocialesRepository.findAll();
        if (listaRedesSociales.isEmpty()) {
            return null;
        } else {
            return listaRedesSociales.get(0);
        }
    }

}
