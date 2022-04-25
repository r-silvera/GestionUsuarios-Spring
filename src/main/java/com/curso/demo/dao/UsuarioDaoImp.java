package com.curso.demo.dao;

import com.curso.demo.models.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{

    @Override
    public List<Usuario> getUsuarios() {
        return null;
    }
}
