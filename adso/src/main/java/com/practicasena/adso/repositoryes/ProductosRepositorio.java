package com.practicasena.adso.repositoryes;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practicasena.adso.models.Productos;

public interface ProductosRepositorio extends JpaRepository<Productos,Integer> {
    
    List<Productos> findByCategoria(String categoria);
}
