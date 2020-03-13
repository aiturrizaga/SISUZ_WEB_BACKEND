package com.sisuz.cloud.admclinica.controller;

import com.sisuz.cloud.admclinica.entity.Igv;
import com.sisuz.cloud.admclinica.service.jpa.IgvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/igv")
public class IgvController {

    @Autowired
    private IgvService igvService;

    @PostMapping("/new")
    public Igv newIgv(@RequestBody Igv igv) {
        return this.igvService.saveIgv(igv);
    }

    @PutMapping
    public Igv updateIgv(@RequestBody Igv igv) {
        return this.igvService.updateIgv(igv);
    }

    @GetMapping("/latest")
    public Igv getIgvLatest() {
        return this.igvService.getIgvLatest();
    }

    @GetMapping("/history")
    public List<Igv> getIgvHistory() {
        return this.igvService.getIgvHistory();
    }
}
