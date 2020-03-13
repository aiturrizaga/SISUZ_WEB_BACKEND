package com.sisuz.cloud.admclinica.service.jpa;

import com.sisuz.cloud.admclinica.entity.Igv;
import com.sisuz.cloud.admclinica.error.BusinessException;
import com.sisuz.cloud.admclinica.repository.jpa.IgvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IgvService {

    @Autowired
    private IgvRepository igvRepository;

    public Igv saveIgv(Igv igv) {
        return this.igvRepository.save(igv);
    }

    public Igv updateIgv(Igv igv) {
        return this.igvRepository.findById(igv.getCodIgv())
                .map(impuesto -> {
                    impuesto.setEstIgv("I");
                    impuesto.setFecModIgv(igv.getFecModIgv());
                    impuesto.setUsuModIgv(igv.getUsuModIgv());
                    // Actualizar el registro anterior
                    this.igvRepository.save(impuesto);
                    // Guarda el nuevo valor de igv
                    return this.igvRepository.save(
                            new Igv(null,
                                    igv.getDescIgv(),
                                    igv.getPorcIgv(),
                                    igv.getFecCreaIgv(),
                                    igv.getUsuCreaIgv(),
                                    null,
                                    null,
                                    igv.getEstIgv())
                    );
                }).orElseThrow(() -> new BusinessException("IGV id not found: " + igv.getCodIgv()));
    }

    public Igv getIgvLatest() {
        return this.igvRepository.findByEstIgv("A");
    }

    public List<Igv> getIgvHistory() {
        return this.igvRepository.findAllByEstIgvOrderByFecCreaIgvDesc("I");
    }
}
