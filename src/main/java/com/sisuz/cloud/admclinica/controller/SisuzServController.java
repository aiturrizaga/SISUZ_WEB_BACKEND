package com.sisuz.cloud.admclinica.controller;

import com.sisuz.cloud.admclinica.entity.SisuzServ;
import com.sisuz.cloud.admclinica.service.jpa.SisuzServService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/services")
public class SisuzServController {

    @Autowired
    private SisuzServService sisuzService;

    @PostMapping
    public SisuzServ newSisuzService(@RequestBody SisuzServ service) {
        return this.sisuzService.saveService(service);
    }

    @PutMapping("/{codService}")
    public SisuzServ updateSisuzService(@RequestBody SisuzServ service, @PathVariable Long codService) {
        return this.sisuzService.updateService(service, codService);
    }

    @GetMapping
    public List<SisuzServ> getSisuzServices(@RequestHeader String estServ) {
        return this.sisuzService.getSisuzServices(estServ);
    }

}
