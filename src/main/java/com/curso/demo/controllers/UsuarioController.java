package com.curso.demo.controllers;

import com.curso.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Robertino");
        usuario.setApellido("Silvera");
        usuario.setEmail("rlucassilvera@gmail.com");
        usuario.setTelefono("1123930943");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){

        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario1 = new Usuario();
        usuario1.setId(84L);
        usuario1.setNombre("Robertino");
        usuario1.setApellido("Silvera");
        usuario1.setEmail("rlucassilvera@gmail.com");
        usuario1.setTelefono("1123930943");

        Usuario usuario2 = new Usuario();
        usuario2.setId(51L);
        usuario2.setNombre("Franco");
        usuario2.setApellido("Silvera");
        usuario2.setEmail("francosil14@gmail.com");
        usuario2.setTelefono("7456465456");

        Usuario usuario3 = new Usuario();
        usuario3.setId(33L);
        usuario3.setNombre("Brisa");
        usuario3.setApellido("Silvera");
        usuario3.setEmail("brisapou@gmail.com");
        usuario3.setTelefono("456481378");

        usuario1.addList(usuarios);
        usuario2.addList(usuarios);
        usuario3.addList(usuarios);
        return usuarios;
    }


    @RequestMapping(value = "usuario1")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Robertino");
        usuario.setApellido("Silvera");
        usuario.setEmail("rlucassilvera@gmail.com");
        usuario.setTelefono("1123930943");
        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Robertino");
        usuario.setApellido("Silvera");
        usuario.setEmail("rlucassilvera@gmail.com");
        usuario.setTelefono("1123930943");
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Robertino");
        usuario.setApellido("Silvera");
        usuario.setEmail("rlucassilvera@gmail.com");
        usuario.setTelefono("1123930943");
        return usuario;
    }
}
