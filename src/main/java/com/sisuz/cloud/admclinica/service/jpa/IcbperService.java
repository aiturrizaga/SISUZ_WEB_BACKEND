package com.sisuz.cloud.admclinica.service.jpa;

import com.sisuz.cloud.admclinica.entity.Icbper;
import com.sisuz.cloud.admclinica.error.BusinessException;
import com.sisuz.cloud.admclinica.repository.jpa.IcbperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IcbperService {

    @Autowired
    private IcbperRepository icbperRepository;

    public Icbper updateIcbper(Icbper icbper) {
        return this.icbperRepository.findById(icbper.getCodIcbper())
                .map(impuesto -> {
                    impuesto.setEstIcbper("I");
                    impuesto.setFecFinVig(icbper.getFecFinVig());
                    impuesto.setFecModIcbper(icbper.getFecCreaIcbper());
                    impuesto.setUsuModIcbper(icbper.getUsuCreaIcbper());
                    this.icbperRepository.save(impuesto);
                    return this.icbperRepository.save(new Icbper(
                            null,
                            icbper.getValorIcbper(),
                            icbper.getFecIniVig(),
                            null,
                            icbper.getFecCreaIcbper(),
                            icbper.getUsuCreaIcbper(),
                            null,
                            null,
                            "A"
                    ));
                }).orElseThrow(() -> new BusinessException("ICBPER id not found: " + icbper.getCodIcbper()));
    }

    public Icbper saveIcbper(Icbper icbper) {
        return this.icbperRepository.save(icbper);
    }

    public Icbper getIcbperLatest() {
        return this.icbperRepository.findByEstIcbperAndFecModIcbperIsNull("A");
    }

    public List<Icbper> getIcbperHistory() {
        return this.icbperRepository.findAllByEstIcbperAndFecFinVigIsNotNullOrderByFecIniVigDesc("I");
    }
}
