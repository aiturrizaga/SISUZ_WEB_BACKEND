package com.sisuz.cloud.admclinica.controller;

import com.sisuz.cloud.admclinica.entity.Cargo;
import com.sisuz.cloud.admclinica.entity.TipoDocumento;
import com.sisuz.cloud.admclinica.service.jpa.CargoService;
import com.sisuz.cloud.admclinica.service.jpa.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/shared")
public class SharedController {

    @Autowired
    private TipoDocumentoService tipoDocumentoService;

    @Autowired
    private CargoService cargoService;

    @GetMapping("/type-docs")
    public List<TipoDocumento> getTipoDocumento() {
        return this.tipoDocumentoService.findAllTipDoc();
    }

    @GetMapping("/positions")
    public List<Cargo> getCargos() {
        return this.cargoService.findAllCargo();
    }
}
