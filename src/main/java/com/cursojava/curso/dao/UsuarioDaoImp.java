package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
@Transactional //Para construir las consultas a la base de datos
public class UsuarioDaoImp implements  UsuarioDao{

    @PersistenceContext
    EntityManager entityManager; //Uso conexion con la base de datos

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario"; //Consulta hibernate, la consulta se hace sobre los objetos
        List<Usuario> resultado = entityManager.createQuery(query).getResultList();
        return  resultado;
    }
}
