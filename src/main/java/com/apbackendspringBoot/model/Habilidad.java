
package com.apbackendspringBoot.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Lob;

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
    @Lob 
    private String imagen;
    private int posicion;
    
    public Habilidad(){}

    public Habilidad(Long id, String nombre, int porcentajeDominio, String imagen, int posicion) {
        this.id = id;
        this.nombre = nombre;
        this.porcentajeDominio = porcentajeDominio;
        this.imagen = imagen;
        this.posicion = posicion;
    }
    
    

}
