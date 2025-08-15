package com.practicasena.adso.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductosDto {
    private Integer id;
    private String nomprod;
    private String cate;
    private Integer pre;
}
