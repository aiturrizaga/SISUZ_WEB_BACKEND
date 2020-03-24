package com.sisuz.cloud.admclinica.controller;

import com.sisuz.cloud.admclinica.entity.Usuario;
import com.sisuz.cloud.admclinica.service.jpa.UsuarioService;
import com.sisuz.cloud.admclinica.util.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private MailService utilEmail;

    @PostMapping("/email")
    public void sendEmail() {
        this.utilEmail.sendEmail("aiturrizaga.vargas@gmail.com", "ENVIAR MENSAJE DESDE JAVA", "Hola, saludos desde Spring Boot.");
    }

    @PostMapping
    public Usuario saveSisuzUser(@RequestBody Usuario user) {
        return this.usuarioService.newSisuzUser(user);
    }

    @GetMapping(path = "/validations", produces = MediaType.APPLICATION_JSON_VALUE)
    public String verifyUsername(@RequestParam("username") String username) {
        return this.usuarioService.verifyUsername(username);
    }

    @GetMapping
    public List<Usuario> findAllUsers(@RequestHeader String estUsu) {
        return this.usuarioService.findAllUsers(estUsu);
    }
}
