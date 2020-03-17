package com.sisuz.cloud.admclinica.controller;

import com.sisuz.cloud.admclinica.entity.RolSisuz;
import com.sisuz.cloud.admclinica.service.jpa.RolSisuzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/roles")
public class RolSisuzController {

    @Autowired
    private RolSisuzService rolSisuzService;

    @PostMapping
    public RolSisuz saveRol(@RequestBody RolSisuz rol) {
        return this.rolSisuzService.newRol(rol);
    }

    @GetMapping
    public List<RolSisuz> getRoles(@RequestHeader(name = "estado") String estRol) {
        return this.rolSisuzService.findAllRoles(estRol);
    }
}
