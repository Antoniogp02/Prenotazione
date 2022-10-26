/*
package com.app.prenotazione.service;

import com.app.prenotazione.model.*;
import com.app.prenotazione.repository.LoginRepository;
import com.app.prenotazione.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UsuarioService {


    @Autowired
    private UsuarioRepository usuarioRepository;

    private LoginRepository loginRepository;


    public List<Usuario> obtenerUsuarios(){
        return usuarioRepository.findAll();
    }

    public List<Usuario> getAll(){
        return usuarioRepository.findAll();
    }

    public void guardarUsuario(int id, String nombre, String apellidos , String correo, Boolean genero, Date fecha_nacimiento, String DNI, Integer telefono){
        Usuario usuariosGuardar = new Usuario();
        if(id!= 0){
            Usuario u = usuarioRepository.findById(id).orElse(null);
            if(u!=null){
                usuariosGuardar = u;
            }
        }
        usuariosGuardar.setNombre(nombre);
        usuariosGuardar.setApellidos(apellidos);
        usuariosGuardar.setCorreo(correo);
        usuariosGuardar.setFecha_nacimiento(fecha_nacimiento);
        usuariosGuardar.setDNI(DNI);
        usuariosGuardar.setTelefono(telefono);
    }

    public void guardarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public void eliminar(Integer id){
        usuarioRepository.deleteById(id);
    }



}


 */