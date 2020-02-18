package com.estudio.easyParking.repositories;

import com.estudio.easyParking.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    List<Usuario> findAll();
}
