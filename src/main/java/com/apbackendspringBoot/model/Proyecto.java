
package com.apbackendspringBoot.model;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Lob;
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
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date desde;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date hasta;
    private String link;
    @Lob 
    private String[] imagenes;
    private int posicion;
    
    
    public Proyecto(){}

    public Proyecto(Long id, String nombre, String descripcion, Date desde, Date hasta, String link, String[] imagenes, int posicion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.desde = desde;
        this.hasta = hasta;
        this.link = link;
        this.imagenes = imagenes;
        this.posicion = posicion;
    }
    
    
}
