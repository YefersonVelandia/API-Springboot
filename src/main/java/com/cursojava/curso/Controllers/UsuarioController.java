package com.cursojava.curso.Controllers;


import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //Anotación
public class UsuarioController {

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
           List<Usuario> usuarios = new ArrayList<>();

        Usuario objUsuario = new Usuario();
        objUsuario.setId(1L);
        objUsuario.setNombre("pedro");
        objUsuario.setApellido("fernandez");
        objUsuario.setEmail("correo@correo.com");
        objUsuario.setTelefono(34434343);

        Usuario objUsuario2 = new Usuario();
        objUsuario2.setId(2L);
        objUsuario2.setNombre("ana");
        objUsuario2.setApellido("vallon");
        objUsuario2.setEmail("correo@correo.com");
        objUsuario2.setTelefono(34434343);


        Usuario objUsuario3 = new Usuario();
        objUsuario3.setId(3L);
        objUsuario3.setNombre("jejeje");
        objUsuario3.setApellido("jijiji");
        objUsuario3.setEmail("correo@correo.com");
        objUsuario3.setTelefono(34434343);

        usuarios.add(objUsuario);
        usuarios.add(objUsuario2);
        usuarios.add(objUsuario3);

        return usuarios;
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
