
package com.apbackendspringBoot.security.dto;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Carolina veronica Perez
 */
@Getter @Setter
public class Mensaje {
    private String mensaje;

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}