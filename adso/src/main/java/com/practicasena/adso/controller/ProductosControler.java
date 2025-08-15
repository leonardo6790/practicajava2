package com.practicasena.adso.controller;

import org.springframework.web.bind.annotation.RestController;

import com.practicasena.adso.models.Productos;
import com.practicasena.adso.repositoryes.ProductosRepositorio;
import com.practicasena.adso.services.ProductosDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class ProductosControler {
    @Autowired
    private ProductosRepositorio prodRepo;


  @GetMapping("/GEISITO")
  public String llamarProductos() {
      return prodRepo.findAll().toString();
  }
  @GetMapping("/ListaProductos")
  public List<Productos> llamarprodlist() {
      return prodRepo.findAll();
  }
  

  @PostMapping("/AgregarProductos")
  public Productos agregarP(@RequestBody Productos productos) {
      return prodRepo.save(productos);
  }
  

  @PutMapping("/ActualisandoProd/{id}")
  public String ActualizarProd(@PathVariable String id, @RequestBody Productos productos) {
      Productos actualizarProductos = prodRepo.findById(Integer.parseInt(id)).orElse(null);
    if (actualizarProductos == null){
        return "producto no encontrado";
    }
    actualizarProductos.setNombre(productos.getNombre());
    actualizarProductos.setPrecio(productos.getPrecio());
    actualizarProductos.setCategoria(productos.getCategoria());
    prodRepo.save(actualizarProductos);
    return "producto actualizado";
  }

  @GetMapping("/buscarcat/{categoria}")
  public List<Productos> encontrarcategoria(@PathVariable String categoria) {
      return prodRepo.findByCategoria(categoria);
  }

  @DeleteMapping("/Borrando/{id}")
  private String eliminarProducto(@PathVariable Integer id){
    prodRepo.deleteById(id);
return "eliminao";
  }

 
}
