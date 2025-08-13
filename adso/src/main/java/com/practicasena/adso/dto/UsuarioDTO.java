package com.practicasena.adso.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsuarioDTO {
    private Integer id_usuario;
    private String nombre;
    private String apellido;
    private String ciudad;
}
