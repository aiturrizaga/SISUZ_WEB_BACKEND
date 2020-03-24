package com.sisuz.cloud.admclinica.service.jpa;

import com.google.gson.JsonObject;
import com.sisuz.cloud.admclinica.entity.Usuario;
import com.sisuz.cloud.admclinica.repository.jpa.UsuarioRolRepository;
import com.sisuz.cloud.admclinica.repository.jpa.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioRolRepository usuarioRolRepository;

    public Usuario newSisuzUser(Usuario user) {
        return this.usuarioRepository.save(user);
    }

    public String verifyUsername(String username) {
        JsonObject jsonVerifyUser = new JsonObject();
        Usuario user = this.usuarioRepository.findByNomUsu(username.trim());
        jsonVerifyUser.addProperty("username", username);
        jsonVerifyUser.addProperty("isUsed", user != null ? true : false);

        return jsonVerifyUser.toString();
    }

    public List<Usuario> findAllUsers(String estUsu) {
        return this.usuarioRepository.findAllByEstUsu(estUsu);
    }
}
