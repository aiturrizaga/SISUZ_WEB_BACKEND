package com.sisuz.cloud.admclinica.controller;

import com.sisuz.cloud.admclinica.entity.Empresa;
import com.sisuz.cloud.admclinica.service.jpa.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/company")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @PostMapping
    public Empresa saveCompany(@RequestBody Empresa empresa) {
        return this.empresaService.newCompany(empresa);
    }
}
