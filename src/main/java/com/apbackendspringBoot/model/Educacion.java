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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreInstitucion;
    private String tituloObtenido;
    @Lob 
    private String logoInstitucional;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date desde;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date hasta;
    private int posicion;
    
    public Educacion(){}

    public Educacion(Long id, String nombreInstitucion, String tituloObtenido, String logoInstitucional, Date desde, Date hasta, int posicion) {
        this.id = id;
        this.nombreInstitucion = nombreInstitucion;
        this.tituloObtenido = tituloObtenido;
        this.logoInstitucional = logoInstitucional;
        this.desde = desde;
        this.hasta = hasta;
        this.posicion = posicion;
    }
}
