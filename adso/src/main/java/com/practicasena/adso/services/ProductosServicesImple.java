package com.practicasena.adso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicasena.adso.dto.ProductosDto;
import com.practicasena.adso.mapper.ProductosMapper;
import com.practicasena.adso.models.Productos;
import com.practicasena.adso.models.Usuario;
import com.practicasena.adso.repositoryes.ProductosRepositorio;

@Service
public class ProductosServicesImple implements ProductosServices {
    @Autowired
    private ProductosRepositorio prodRepo;

    @Autowired
    private ProductosMapper prodMap;

    @Override
    public ProductosDto getProductos(Integer productosid){
        Productos productos = prodRepo.findById(productosid).get();
        return prodMap.toProductosDTO(productos);
    }


    @Override
    public List<ProductosDto> getProductos(){
        List<Productos> productos = prodRepo.findAll();
        return prodMap.toProductosDTOList(productos);
    }
}
