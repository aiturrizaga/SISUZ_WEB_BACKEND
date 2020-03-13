package com.sisuz.cloud.admclinica.service.jpa;

import com.sisuz.cloud.admclinica.entity.SisuzServ;
import com.sisuz.cloud.admclinica.error.BusinessException;
import com.sisuz.cloud.admclinica.repository.jpa.SisuzServRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SisuzServService {

    @Autowired
    private SisuzServRepository sisuzServRepository;

    public SisuzServ updateService(SisuzServ service, Long codService) {
        return this.sisuzServRepository.findById(codService)
                .map(sisuz -> {
                    sisuz.setNomServ(service.getNomServ());
                    sisuz.setMontoPubServ(service.getMontoPubServ());
                    sisuz.setMontoMinServ(service.getMontoMinServ());
                    sisuz.setRespServ(service.getRespServ());
                    sisuz.setFecModServ(service.getFecModServ());
                    sisuz.setUsuModServ(service.getUsuModServ());
                    return this.sisuzServRepository.save(sisuz);
                }).orElseThrow(() -> new BusinessException("Sisuz Service id not found: " + codService));
    }

    public SisuzServ saveService(SisuzServ service) {
        return this.sisuzServRepository.save(service);
    }

    public List<SisuzServ> getSisuzServices(String estServ) {
        return this.sisuzServRepository.findAllByEstServ(estServ);
    }
}
