
package com.apbackendspringBoot.security.model;
import com.apbackendspringBoot.security.enums.RolNombre;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author Carolina veronica Perez
 */


@Getter @Setter
@Entity
public class Rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;

    public Rol() {}

    public Rol(RolNombre rolNombre) { this.rolNombre = rolNombre; }
}