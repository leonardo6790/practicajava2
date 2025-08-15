package com.practicasena.adso.mapper;

import java.util.List;

import com.practicasena.adso.dto.ProductosDto;
import com.practicasena.adso.models.Productos;

public interface ProductosMapper {
    Productos toProductos(ProductosDto productosDTO);

    ProductosDto toProductosDTO(Productos productos);

    List<ProductosDto> toProductosDTOList(List<Productos> productos);

}
