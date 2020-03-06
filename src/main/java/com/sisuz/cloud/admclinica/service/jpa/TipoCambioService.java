package com.sisuz.cloud.admclinica.service.jpa;

import com.sisuz.cloud.admclinica.entity.TipoCambio;
import com.sisuz.cloud.admclinica.error.ExchangeRateNotFoundException;
import com.sisuz.cloud.admclinica.repository.jpa.TipoCambioRepository;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class TipoCambioService {

    @Autowired
    private TipoCambioRepository tipoCambioRepository;

    public TipoCambio updateTipoCambio(TipoCambio tipoCambio) throws ParseException {
        TipoCambio oldExchange = this.tipoCambioRepository.findById(tipoCambio.getCodTipoCambio()).get();
        String fecinivig = new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(oldExchange.getFecIniVig()));
        String feccrea = new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(oldExchange.getFecCreaTipoCambio()));
        oldExchange.setEstTipoCambio("I");
        oldExchange.setFecIniVig(fecinivig);
        oldExchange.setFecCreaTipoCambio(feccrea);
        oldExchange.setFecFinVig(tipoCambio.getFecFinVig());
        oldExchange.setFecModTipoCambio(tipoCambio.getFecModTipoCambio());
        oldExchange.setUsuModTipoCambio(tipoCambio.getUsuCreaTipoCambio());
        this.tipoCambioRepository.save(oldExchange);

        tipoCambio.setCodTipoCambio(null);
        tipoCambio.setFecFinVig(null);
        tipoCambio.setFecModTipoCambio(null);
        tipoCambio.setUsuModTipoCambio(null);
        return this.tipoCambioRepository.save(tipoCambio);
    }

    public List<TipoCambio> getExchangeHistory() {
        return this.tipoCambioRepository.findAllByEstTipoCambioAndFecFinVigIsNotNull("I");
    }

    public TipoCambio getExchangeLatest() {
        return this.tipoCambioRepository.findByEstTipoCambioAndFecModTipoCambioIsNull("A");
    }
}
