package com.practicasena.adso.mapper;

import org.springframework.stereotype.Component;

import com.practicasena.adso.dto.ProductosDto;
import com.practicasena.adso.models.Productos;

@Component
public class ProductosMapperImple implements ProductosMapper {

    @Override
    public Productos toProductos(ProductosDto productosDTO){
        if (productosDTO == null) {
            return null;
        }
        Productos productos = new Productos();
        productos.setId_productos(productosDTO.getId());
        productos.setNombre(productosDTO.getNomprod());
        productos.setCategoria(productosDTO.getCate());
        productos.setPrecio(productosDTO.getPre());
        return productos;
    }
    @Override
    public ProductosDto toProductosDTO(Productos productos){
        if (productos == null){
            return null;
        }
        ProductosDto productosDto = new ProductosDto();
        productosDto.setId(productos.getId_productos());
        productosDto.setNomprod(productos.getNombre());
        productosDto.setCate(productos.getCategoria());
        productosDto.setPre(productos.getPrecio());
        return productosDto;
    }
    
}
