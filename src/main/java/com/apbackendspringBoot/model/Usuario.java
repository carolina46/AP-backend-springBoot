
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
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   
    private String nombreUsuario;
    private String clave;
    
    public Usuario(){}

    public Usuario(Long id, String nombreUsuario, String clave) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    
    
}
