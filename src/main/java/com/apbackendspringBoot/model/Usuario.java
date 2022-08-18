
package com.apbackendspringBoot.model;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carolina Veronica Perez
 */

@Getter @Setter
@Entity
public class Usuario {
    
    @Id
    private String nombreUsuario;
    private String clave;
    
    public Usuario(){}

    public Usuario(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    
    
}
