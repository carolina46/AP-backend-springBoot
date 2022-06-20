
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
public class AcercaDe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    private String nombreCompleto;
    private byte[] fotoPerfil;
    private String titulo;
    private String informacionPersonal;
    private byte[] banner;
    
    public AcercaDe(){}

    public AcercaDe(Long id, String nombreCompleto, byte[] fotoPerfil, String titulo, String informacionPersonal, byte[] banner) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.fotoPerfil = fotoPerfil;
        this.titulo = titulo;
        this.informacionPersonal = informacionPersonal;
        this.banner = banner;
    }
    
    
    
}
