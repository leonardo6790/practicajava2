package com.practicasena.adso.services;

import java.util.List;

import com.practicasena.adso.dto.ProductosDto;

public interface ProductosServices {
    public ProductosDto getProductos(Integer id_productos);

    public ProductosDto saveUsuario(ProductosDto productosDto);

    public List<ProductosDto> getProductos();
}
