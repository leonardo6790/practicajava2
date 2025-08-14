package com.practicasena.adso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicasena.adso.dto.UsuarioDTO;
import com.practicasena.adso.mapper.UsuarioMapper;
import com.practicasena.adso.models.Usuario;
import com.practicasena.adso.repositoryes.UsuarioRepositorio;

@Service
public class UsuarioServicesImple implements UsuarioServices{

    @Autowired
    private UsuarioRepositorio userRepo;

    @Autowired
    private UsuarioMapper userMap;

    @Override
    public UsuarioDTO getUsuario(Integer usuarioid){
        Usuario usuario = userRepo.findById(usuarioid).get();
        return userMap.toUsuarioDTO(usuario);
    }

    @Override
    public UsuarioDTO saveUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = userMap.toUsuario(usuarioDTO);
        return userMap.toUsuarioDTO(userRepo.save(usuario));
    }

    @Override
    public List<UsuarioDTO> getUsuario(){
        List<Usuario> usuario = userRepo.findAll();
        return userMap.toUsuarioDTOList(usuario);
    }
    @Override
    public UsuarioDTO deleteUsuario(Integer id_usuario){
        Usuario usuario = userRepo.findById(id_usuario).get();
        userRepo.delete(usuario);
        return userMap.toUsuarioDTO(usuario);
    }

}
