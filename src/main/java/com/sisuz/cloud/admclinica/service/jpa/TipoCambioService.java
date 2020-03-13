package com.sisuz.cloud.admclinica.service.jpa;

import com.sisuz.cloud.admclinica.entity.TipoCambio;
import com.sisuz.cloud.admclinica.error.ExchangeRateNotFoundException;
import com.sisuz.cloud.admclinica.repository.jpa.TipoCambioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoCambioService {

    @Autowired
    private TipoCambioRepository tipoCambioRepository;

    public TipoCambio updateTipoCambio(TipoCambio tipoCambio) {
        return this.tipoCambioRepository.findById(tipoCambio.getCodTipoCambio())
                .map(exchange -> {
                    exchange.setEstTipoCambio("I");
                    exchange.setFecFinVig(tipoCambio.getFecFinVig());
                    exchange.setFecModTipoCambio(tipoCambio.getFecModTipoCambio());
                    exchange.setUsuModTipoCambio(tipoCambio.getUsuCreaTipoCambio());
                    // Actualiza el registro anterior
                    this.tipoCambioRepository.save(exchange);
                    // Guarda el nuevo registro
                    return this.tipoCambioRepository.save(
                            new TipoCambio(null,
                                    tipoCambio.getCodGrupoCia(),
                                    tipoCambio.getValTipoCambio(),
                                    tipoCambio.getFecIniVig(),
                                    null,
                                    tipoCambio.getEstTipoCambio(),
                                    tipoCambio.getFecCreaTipoCambio(),
                                    tipoCambio.getUsuCreaTipoCambio(),
                                    null,
                                    null)
                    );
                }).orElseThrow(() -> new ExchangeRateNotFoundException(tipoCambio.getCodTipoCambio()));
    }

    public List<TipoCambio> getExchangeHistory() {
        return this.tipoCambioRepository.findAllByEstTipoCambioAndFecFinVigIsNotNullOrderByFecIniVigDesc("I");
    }

    public TipoCambio getExchangeLatest() {
        return this.tipoCambioRepository.findByEstTipoCambioAndFecModTipoCambioIsNull("A");
    }
}
