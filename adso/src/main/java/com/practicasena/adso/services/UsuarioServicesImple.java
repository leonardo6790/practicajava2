package com.practicasena.adso.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.practicasena.adso.dto.UsuarioDTO;
import com.practicasena.adso.mapper.UsuarioMapper;
import com.practicasena.adso.models.Usuario;
import com.practicasena.adso.repositoryes.UsuarioRepositorio;

public class UsuarioServicesImple implements UsuarioServices{
    @Autowired
    private UsuarioRepositorio userRepo;
    private UsuarioMapper userMap;

    @Override 
    public UsuarioDTO getUsuario(Integer id_usuario){
        Usuario usuario = userRepo.findById(id_usuario).get();
        return userMap.toUsuarioDTO(usuario);

        

    }

}
