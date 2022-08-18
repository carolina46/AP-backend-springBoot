
package com.apbackendspringBoot.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author Carolina Veronica Perez
 */

@Getter @Setter
@Entity
public class RedesSociales {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String facebook;
    private String instagram;
    private String twitter;
    private String argentinaPrograma;
    

    public RedesSociales(){}

    public RedesSociales(String facebook, String instragram, String twitter, String argentinaPrograma) {
        this.facebook = facebook;
        this.instagram = instragram;
        this.twitter = twitter;
        this.argentinaPrograma = argentinaPrograma;
    }
    
    
    
}
