package com.sisuz.cloud.admclinica.controller;

import com.sisuz.cloud.admclinica.entity.Laboratorio;
import com.sisuz.cloud.admclinica.service.jpa.LaboratorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/labs")
public class LaboratorioController {

    @Autowired
    private LaboratorioService laboratorioService;

    @PutMapping
    public Laboratorio saveLab(@RequestBody Laboratorio laboratorio) {
        return this.laboratorioService.saveOrUpdateLab(laboratorio);
    }

    @GetMapping
    public List<Laboratorio> findAllLabs(@RequestHeader @Valid String estLab) {
        return this.laboratorioService.findAllLabs(estLab);
    }
}
