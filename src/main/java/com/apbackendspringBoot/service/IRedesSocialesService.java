package com.apbackendspringBoot.service;

import com.apbackendspringBoot.model.RedesSociales;


/**
 *
 * @author Carolina Veronica Perez
 */
public interface IRedesSocialesService {
    
    public RedesSociales guardarRedesSociales(RedesSociales redSocial);
    public RedesSociales verRedesSociales();
}