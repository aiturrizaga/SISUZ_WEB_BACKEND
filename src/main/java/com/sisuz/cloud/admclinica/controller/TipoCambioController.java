package com.sisuz.cloud.admclinica.controller;

import com.sisuz.cloud.admclinica.entity.TipoCambio;
import com.sisuz.cloud.admclinica.service.jpa.TipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TipoCambioController {

    @Autowired
    private TipoCambioService tipoCambioService;

    @GetMapping("/exchange/history")
    public List<TipoCambio> getHistoryExchange() {
        return this.tipoCambioService.getHistoryExhange();
    }

    @GetMapping("/exchange/latest")
    public TipoCambio getLastExchange() {
        return this.tipoCambioService.getLastExchange();
    }

    @PostMapping("/exchange")
    public TipoCambio guardarTipoCambio(@RequestBody TipoCambio tipoCambio) {
        return this.tipoCambioService.guardarTipoCambio(tipoCambio);
    }
}
