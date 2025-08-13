package com.practicasena.adso.mapper;

import java.util.List;

import com.practicasena.adso.dto.UsuarioDTO;
import com.practicasena.adso.models.Usuario;

public interface UsuarioMapper {

    Usuario toUsuario(UsuarioDTO usuarioDTO);

    UsuarioDTO toUsuarioDTO(Usuario usuario);

    //List<UsuarioDTO> toUsuariosDtos(List<Usuario>)
}
