
package com.apbackendspringBoot.model;

import javax.persistence.Basic;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Column;
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
public class AcercaDe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
        
    private String nombreCompleto;
    
    @Lob
    private String fotoPerfil;
   
    private String titulo;
    
    @Column(columnDefinition = "TEXT")
    private String informacionPersonal;
    
    @Lob 
    private String banner;
    
    public AcercaDe(){
        this.nombreCompleto = "";
        this.fotoPerfil = "";
        this.titulo = "";
        this.informacionPersonal = "";
        this.banner = "";}

    public AcercaDe(Long id, String nombreCompleto, String fotoPerfil, String titulo, String informacionPersonal, String banner) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.fotoPerfil = fotoPerfil;
        this.titulo = titulo;
        this.informacionPersonal = informacionPersonal;
        this.banner = banner;
    }
    
    
    
}
