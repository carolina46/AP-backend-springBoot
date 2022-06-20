
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
public class RedSocial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String link;

    public RedSocial(){}

    public RedSocial(Long id, String nombre, String link) {
        this.id = id;
        this.nombre = nombre;
        this.link = link;
    }
    
    
    
    
}
