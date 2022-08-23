
package com.apbackendspringBoot.security.dto;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Carolina veronica Perez
 */

@Getter @Setter
/**Tiene sentido cuando se guardan mas datos del usuarios , como correo, edad, etc*/
public class NuevoUsuario {
    private String nombreUsuario;
    private String clave;
    private Set<String> roles = new HashSet<>();
}
