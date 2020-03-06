package com.sisuz.cloud.admclinica.controller;

import com.sisuz.cloud.admclinica.entity.TipoCambio;
import com.sisuz.cloud.admclinica.service.jpa.TipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/exchange")
public class TipoCambioController {

    @Autowired
    private TipoCambioService tipoCambioService;

    @PutMapping
    public TipoCambio updateTipoCambio(@RequestBody TipoCambio tipoCambio) throws ParseException {
        return this.tipoCambioService.updateTipoCambio(tipoCambio);
    }

    @GetMapping("/latest")
    public TipoCambio getExchangeLatest() {
        return this.tipoCambioService.getExchangeLatest();
    }

    @GetMapping("/history")
    public List<TipoCambio> getExchangeHistory() {
        return this.tipoCambioService.getExchangeHistory();
    }

}
