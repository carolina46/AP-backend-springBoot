
package com.apbackendspringBoot.model;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;

/**
 *
 * @author Carolina Veronica Perez
 */

@Getter @Setter
@Entity
public class Habilidad {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private int porcentajeDominio;
    private byte[] imagen;
    
    public Habilidad(){}

    public Habilidad(Long id, String nombre, int porcentajeDominio, byte[] imagen) {
        this.id = id;
        this.nombre = nombre;
        this.porcentajeDominio = porcentajeDominio;
        this.imagen = imagen;
    }
    
    

}
