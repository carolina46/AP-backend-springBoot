
package com.apbackendspringBoot.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

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
    
    @Column(columnDefinition = "TEXT")
    private String fotoPerfil;
   
    private String titulo;
    
    @Column(columnDefinition = "TEXT")
    private String informacionPersonal;
    
    @Column(columnDefinition = "TEXT")
    private String banner;
    
    public AcercaDe(){}

    public AcercaDe(Long id, String nombreCompleto, String fotoPerfil, String titulo, String informacionPersonal, String banner) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.fotoPerfil = fotoPerfil;
        this.titulo = titulo;
        this.informacionPersonal = informacionPersonal;
        this.banner = banner;
    }
    
    
    
}
