package com.cursojava.curso.Controllers;


import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //Anotación
public class UsuarioController {

    @Autowired //Crea objeto ya demas es compartido en memoria
    private UsuarioDao usuarioDao;
    //Manejo de URL

    @RequestMapping(value = "usuario/{id}") //Ruta que devolvera el usuario
    public Usuario getusuario(@PathVariable Long id){
        Usuario objUsuario = new Usuario();

        objUsuario.setId(id);
        objUsuario.setNombre("pedro");
        objUsuario.setApellido("fernandez");
        objUsuario.setEmail("correo@correo.com");
        objUsuario.setTelefono(34434343);

        return objUsuario;
    }

    @RequestMapping(value = "usuarios") //Ruta que devolvera el usuario
    public List<Usuario> getusuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "usuarioeditar") //Ruta que devolvera el usuario
    public Usuario editar(){

        Usuario objUsuario = new Usuario();

        objUsuario.setNombre("pedro");
        objUsuario.setApellido("fernandez");
        objUsuario.setEmail("correo@correo.com");
        objUsuario.setTelefono(34434343);

        return objUsuario;
    }


    @RequestMapping(value = "usuariodelete") //Ruta que devolvera el usuario
    public Usuario eliminar(){

        Usuario objUsuario = new Usuario();

        objUsuario.setNombre("pedro");
        objUsuario.setApellido("fernandez");
        objUsuario.setEmail("correo@correo.com");
        objUsuario.setTelefono(34434343);

        return objUsuario;
    }

    @RequestMapping(value = "buscar") //Ruta que devolvera el usuario
    public Usuario actualizar(){

        Usuario objUsuario = new Usuario();

        objUsuario.setNombre("pedro");
        objUsuario.setApellido("fernandez");
        objUsuario.setEmail("correo@correo.com");
        objUsuario.setTelefono(34434343);

        return objUsuario;
    }



}
