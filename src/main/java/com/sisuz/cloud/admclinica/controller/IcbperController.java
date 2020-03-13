package com.sisuz.cloud.admclinica.controller;

import com.sisuz.cloud.admclinica.entity.Icbper;
import com.sisuz.cloud.admclinica.service.jpa.IcbperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/icbper")
public class IcbperController {

    @Autowired
    private IcbperService icbperService;

    @PutMapping
    public Icbper updateIcbper(@RequestBody Icbper icbper) {
        return this.icbperService.updateIcbper(icbper);
    }

    @PostMapping("/new")
    public Icbper newIcbper(@RequestBody Icbper icbper) {
        return this.icbperService.saveIcbper(icbper);
    }

    @GetMapping("/latest")
    public Icbper getIcbperLatest() {
        return this.icbperService.getIcbperLatest();
    }

    @GetMapping("/history")
    public List<Icbper> getIcbperHistory() {
        return this.icbperService.getIcbperHistory();
    }
}
