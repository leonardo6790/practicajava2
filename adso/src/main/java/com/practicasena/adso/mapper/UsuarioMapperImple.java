package com.practicasena.adso.mapper;

import java.util.ArrayList;
import java.util.List;

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
    usuario.setId_usuario(usuarioDTO.getId());
    usuario.setNombre(usuarioDTO.getNom());
    usuario.setApellido(usuarioDTO.getApe());
    usuario.setCiudad(usuarioDTO.getCiu());
    return usuario;
}

@Override
public UsuarioDTO toUsuarioDTO(Usuario usuario){
    if (usuario == null) {
        return null;
    }
    UsuarioDTO usuarioDTO = new UsuarioDTO();
    usuarioDTO.setId(usuario.getId_usuario());
    usuarioDTO.setNom(usuario.getNombre());
    usuarioDTO.setApe(usuario.getApellido());
    usuarioDTO.setCiu(usuario.getCiudad());
    return usuarioDTO;
}
@Override
public List<UsuarioDTO> toUsuarioDTOList (List<Usuario> usuarios) {
    if(usuarios == null){
        return List.of();
    }
    
    List<UsuarioDTO> usuarioDTOs = new 
    ArrayList<UsuarioDTO>(usuarios.size());
    for(Usuario usuario : usuarios){
        usuarioDTOs.add(toUsuarioDTO(usuario));
    }
    return usuarioDTOs;
}

@Override
public void updateUsuario(Usuario usuario, UsuarioDTO usuarioDto){
    if(usuarioDto == null){
    return;
    }
    usuario.setNombre(usuarioDto.getNom());
    usuario.setApellido(usuarioDto.getApe());
    usuario.setCiudad(usuarioDto.getCiu());
}

}
