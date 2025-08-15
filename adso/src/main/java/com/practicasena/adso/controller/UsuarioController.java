package com.practicasena.adso.controller;

import org.springframework.web.bind.annotation.RestController;

import com.practicasena.adso.dto.UsuarioDTO;
import com.practicasena.adso.models.Usuario;
import com.practicasena.adso.repositoryes.UsuarioRepositorio;
import com.practicasena.adso.services.UsuarioServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;







@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepositorio userRepo;

    @Autowired
    private UsuarioServices userSer;

    @GetMapping("/user")
    public String UsuarioControl() {
        return new String("conectando desde usuario controller");
    }
    @GetMapping("/usuarios")
    public String ListaUsuarios() {
        return userRepo.findAll().toString();
    }
    @GetMapping("/UsuariosLista")
    public List<Usuario> UsuariosLista() {
        return userRepo.findAll();
    }
    @PostMapping("/AgregarUsuario")
    public Usuario creausuario(@RequestBody Usuario usuario) {
        return userRepo.save(usuario);
    }
    @PostMapping("/AgregarUsuario2")
    public ResponseEntity<Usuario> creausuarios(@RequestBody Usuario usuario) {
        Usuario nuevoUsuario = userRepo.save(usuario);
        return ResponseEntity.ok(nuevoUsuario);
    }
    @DeleteMapping("/user/{id}")
    public String eliminausuario(@PathVariable Integer id){
        userRepo.deleteById(id);
        return "";
    }
    @PutMapping("usuario/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody Usuario usuario) {
        Usuario userupdate = userRepo.findById(Integer.parseInt(id)).orElse(null);
        if (userupdate == null){
            return "usuario no encontrado";
        }
        userupdate.setNombre(usuario.getNombre());
        userupdate.setApellido(usuario.getApellido());
        userupdate.setCiudad(usuario.getCiudad());
        userRepo.save(userupdate);
        return "Usuario actualizado";
    }   

    @GetMapping("/Dot/{id}")
    public ResponseEntity<UsuarioDTO> usuarioser(@PathVariable Integer id) {
        return new ResponseEntity<>(userSer.getUsuario(id),HttpStatus.OK);
    }

    @PostMapping("/agregarusuario")
    public ResponseEntity<UsuarioDTO> saveUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        return new ResponseEntity<>(userSer.saveUsuario(usuarioDTO),HttpStatus.CREATED);
    }
    
    @DeleteMapping("/borrarusuariodto/{id}")
    public ResponseEntity<UsuarioDTO> deleteUsuario(@PathVariable Integer id){
        return new ResponseEntity<>(userSer.deleteUsuario(id),HttpStatus.OK);
    }

    @PutMapping("/actualizarusuario/{popo}")
    public ResponseEntity<UsuarioDTO> updateuser(@PathVariable Integer popo, @RequestBody UsuarioDTO usuarioDto) {
        return new ResponseEntity<>(userSer.updateuser(popo, usuarioDto),HttpStatus.OK);
    }
}
