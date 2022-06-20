
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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String descripcion;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date desde;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date hasta;
    private String link;
    private byte[] imagenes;
    
    
    public Proyecto(){}

    public Proyecto(Long id, String nombre, String descripcion, Date desde, Date hasta, String link, byte[] imagenes) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.desde = desde;
        this.hasta = hasta;
        this.link = link;
        this.imagenes = imagenes;
    }
    
    
}
