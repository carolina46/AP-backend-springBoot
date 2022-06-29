
package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.AcercaDe;
import com.apbackendspringBoot.repository.AcercaDeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author Carolina veronica Perez
 */
@Service
@CrossOrigin
public class AcercaDeService implements IAcercaDeService{
    
    @Autowired
    public AcercaDeRepository acercaDeRepository;

    @Override
    public void guardarAcercaDe(AcercaDe acercaDe) {
       List<AcercaDe> listaAcercaDe =acercaDeRepository.findAll();
       if(!listaAcercaDe.isEmpty()){
         Long id = listaAcercaDe.get(0).getId();
         acercaDe.setId(id);
       }
       acercaDeRepository.save(acercaDe);
    }

    @Override
    public AcercaDe verAcercaDe() {
       List<AcercaDe> listaAcercaDe =acercaDeRepository.findAll();
       if(listaAcercaDe.isEmpty())
           return new AcercaDe();
      else
         return listaAcercaDe.get(0);
              
    }

}
