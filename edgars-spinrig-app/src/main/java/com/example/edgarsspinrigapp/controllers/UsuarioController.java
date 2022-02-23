package com.example.edgarsspinrigapp.controllers;

import com.example.edgarsspinrigapp.services.UsuarioService;

import java.util.ArrayList;
import java.util.Optional;

import com.example.edgarsspinrigapp.models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
 @Autowired
  UsuarioService usuarioService;
  
  @GetMapping()
  public ArrayList<UsuarioModel> obtenerUsuarios(){
      return usuarioService.obtenerUsuarios();
  }

  @GetMapping(path = "/{id}")
  public Optional<UsuarioModel> obtenerPorId(@PathVariable("id")long id){
      return usuarioService.obtenerPorId(id);
  }

  @GetMapping(path = "/query")
  public ArrayList<UsuarioModel> obtenerPorPrioridad(@PathVariable("prioridad")Integer id){
      return usuarioService.obtenerPorPrioridad(id);
  }

  @DeleteMapping(path = "/{id}")
  public String eliminarPorId(@PathVariable("id")Long id){
      boolean ok = this.usuarioService.eliminarusuario(id);
      if(ok){
        return "se elimino el id " + id;
      }else{
        return "no se pudo eliminar el " + id;
      }
  }

  @PostMapping()
  public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
      return this.usuarioService.guardarUsuario(usuario);
  }
}