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
 * @author Carolina veronica Perez
 */

@Getter @Setter
@Entity
public class Experiencia {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombreLugarDeTrabajo;
    private String nombrePuesto;
    private byte[] logoEmpresa;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date desde;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date hasta;
    private String descripcionActividades;
    
    
    public Experiencia(){}

    public Experiencia(Long id, String nombreLugarDeTrabajo, String nombrePuesto, byte[] logoEmpresa, Date desde, Date hasta, String descripcionActividades) {
        this.id = id;
        this.nombreLugarDeTrabajo = nombreLugarDeTrabajo;
        this.nombrePuesto = nombrePuesto;
        this.logoEmpresa = logoEmpresa;
        this.desde = desde;
        this.hasta = hasta;
        this.descripcionActividades = descripcionActividades;
    }
    
    
    
    
    

}
