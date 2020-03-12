package com.sisuz.cloud.admclinica.controller;

import com.sisuz.cloud.admclinica.entity.Local;
import com.sisuz.cloud.admclinica.service.jpa.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/local")
public class LocalController {

    @Autowired
    private LocalService localService;

    @PostMapping
    public Local saveLocal(@RequestBody Local local) {
        return this.localService.saveLocal(local);
    }

    @PutMapping
    public Local updateLocal(@RequestBody Local local) {
        return this.localService.updateLocal(local);
    }

    @GetMapping
    public List<Local> findLocal(@RequestHeader @Valid String estLocal) {
        return this.localService.findLocal(estLocal);
    }
}
