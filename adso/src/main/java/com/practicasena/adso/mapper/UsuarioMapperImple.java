package com.practicasena.adso.mapper;

import org.springframework.stereotype.Component;

import com.practicasena.adso.dto.UsuarioDTO;
import com.practicasena.adso.models.Usuario;

@Component
public class UsuarioMapperImple implements UsuarioMapper {
@Override
public Usuario toUsuario(UsuarioDTO usuarioDTO){
    if(usuarioDTO == null) {
        return null;
    }

    Usuario usuario = new Usuario();
    usuario.setId_usuario(usuarioDTO.getId_usuario());
    usuario.setNombre(usuarioDTO.getNombre());
    usuario.setApellido(usuarioDTO.getApellido());
    usuario.setCiudad(usuarioDTO.getCiudad());
    return usuario;
}

@Override
public UsuarioDTO toUsuarioDTO(Usuario usuario){
    if (usuario == null) {
        return null;
    }
    UsuarioDTO usuarioDTO = new UsuarioDTO();
    usuarioDTO.setId_usuario(usuario.getId_usuario());
    usuarioDTO.setNombre(usuario.getNombre());
    usuarioDTO.setApellido(usuario.getApellido());
    usuarioDTO.setCiudad(usuario.getCiudad());
    return usuarioDTO;
}
}
