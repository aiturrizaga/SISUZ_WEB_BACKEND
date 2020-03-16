package com.sisuz.cloud.admclinica.service.jpa;

import com.google.gson.JsonObject;
import com.sisuz.cloud.admclinica.entity.UsuarioSisuz;
import com.sisuz.cloud.admclinica.repository.jpa.UsuarioSisuzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioSisuzService {

    @Autowired
    private UsuarioSisuzRepository usuarioSisuzRepository;

    public UsuarioSisuz newSisuzUser(UsuarioSisuz user) {
        return this.usuarioSisuzRepository.save(user);
    }

    public String verifyUsername(String username) {
        JsonObject jsonVerifyUser = new JsonObject();
        UsuarioSisuz user = this.usuarioSisuzRepository.findByNomUsu(username.trim());
        jsonVerifyUser.addProperty("username", username);
        jsonVerifyUser.addProperty("isUsed", user != null ? true : false);

        return jsonVerifyUser.toString();
    }

    public List<UsuarioSisuz> findAllUsers(String estUsu) {
        return this.usuarioSisuzRepository.findAllByEstUsu(estUsu);
    }
}
