package com.estudio.easyParking.implementations;

import com.estudio.easyParking.entities.Usuario;
import com.estudio.easyParking.pojos.UsuarioVO;
import com.estudio.easyParking.repositories.UsuarioRepository;
import com.estudio.easyParking.services.IUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl  implements IUsuariosService {
    @Autowired
    private UsuarioRepository repository;

    @Override
    public List<UsuarioVO> findAll() {
        List<UsuarioVO> usuarios = new ArrayList<>();
        try {

            for (Usuario usuario : repository.findAll()) {
                UsuarioVO user = new UsuarioVO();
                user.setDocumento(usuario.getDocumento());
                user.setNombre(usuario.getNombre());
                user.setIdUsuario(usuario.getIdUsuario());
                user.setTipo(usuario.getTipo());
                user.getSuscripciones().addAll(usuario.getSuscripciones());
                usuarios.add(user);
            }
        }catch (Exception e){
            System.out.println(e);
        }


        return usuarios;
    }
}
