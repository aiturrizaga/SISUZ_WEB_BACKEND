package com.sisuz.cloud.admclinica.controller;

import com.sisuz.cloud.admclinica.entity.Rol;
import com.sisuz.cloud.admclinica.service.jpa.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    private RolService rolService;

    @PostMapping
    public Rol saveRol(@RequestBody Rol rol) {
        return this.rolService.newRol(rol);
    }

    @GetMapping
    public List<Rol> getRoles(@RequestHeader(name = "estado") String estRol) {
        return this.rolService.findAllRoles(estRol);
    }
}
