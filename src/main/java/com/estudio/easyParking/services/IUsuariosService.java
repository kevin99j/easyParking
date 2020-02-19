package com.estudio.easyParking.services;

import com.estudio.easyParking.entities.Usuario;
import com.estudio.easyParking.pojos.UsuarioVO;

import java.util.List;


public interface IUsuariosService {

    List<UsuarioVO> findAll();

    String create(Usuario user);
}
