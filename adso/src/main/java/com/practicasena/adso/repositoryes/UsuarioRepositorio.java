package com.practicasena.adso.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practicasena.adso.models.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario,Integer> {

}
