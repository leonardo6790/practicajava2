package com.practicasena.adso.services;

import java.util.List;

import com.practicasena.adso.dto.UsuarioDTO;

public interface UsuarioServices {
    public UsuarioDTO getUsuario(Integer id_usuario);

    public UsuarioDTO saveUsuario(UsuarioDTO usuarioDTO);

    public List<UsuarioDTO> getUsuario();

    public UsuarioDTO deleteUsuario(Integer id_usuario);

    public UsuarioDTO updateuser(Integer usuario, UsuarioDTO usuarioDto);
}
