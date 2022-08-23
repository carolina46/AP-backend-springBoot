
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
public class LoginUsuario {
    private String nombreUsuario;
    private String clave;
}
