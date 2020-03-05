package com.sisuz.cloud.admclinica.service.jpa;

import com.sisuz.cloud.admclinica.entity.TipoCambio;
import com.sisuz.cloud.admclinica.repository.jpa.TipoCambioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoCambioService {

    @Autowired
    private TipoCambioRepository tipoCambioRepository;

    public TipoCambio guardarTipoCambio(TipoCambio tipoCambio) {
        return this.tipoCambioRepository.save(tipoCambio);
    }

    public List<TipoCambio> getAll() {
        return this.tipoCambioRepository.findAll();
    }

    public List<TipoCambio> getHistoryExhange() {
        return this.tipoCambioRepository.findAllByEstTipoCambioAndFecFinVigIsNotNull("I");
    }

    public TipoCambio getLastExchange() {
        return this.tipoCambioRepository.findByEstTipoCambioAndFecModTipoCambioIsNull("A");
    }
}
