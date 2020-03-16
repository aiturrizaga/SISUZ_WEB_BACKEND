package com.sisuz.cloud.admclinica.controller;

import com.sisuz.cloud.admclinica.entity.UsuarioSisuz;
import com.sisuz.cloud.admclinica.service.jpa.UsuarioSisuzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UsuarioSisuzController {

    @Autowired
    private UsuarioSisuzService usuarioSisuzService;

    @PostMapping
    public UsuarioSisuz saveSisuzUser(@RequestBody UsuarioSisuz user) {
        return this.usuarioSisuzService.newSisuzUser(user);
    }

    @GetMapping(path = "/validations", produces = MediaType.APPLICATION_JSON_VALUE)
    public String verifyUsername(@RequestParam("username") String username) {
        return this.usuarioSisuzService.verifyUsername(username);
    }

    @GetMapping
    public List<UsuarioSisuz> findAllUsers(@RequestHeader String estUsu) {
        return this.usuarioSisuzService.findAllUsers(estUsu);
    }
}
