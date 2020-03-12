package com.sisuz.cloud.admclinica.service.jpa;

import com.sisuz.cloud.admclinica.entity.Laboratorio;
import com.sisuz.cloud.admclinica.error.BusinessException;
import com.sisuz.cloud.admclinica.repository.jpa.LaboratorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaboratorioService {

    @Autowired
    private LaboratorioRepository laboratorioRepository;

    public Laboratorio saveLab(Laboratorio newLab) {
        return this.laboratorioRepository.save(newLab);
    }

    public Laboratorio updateLab(Laboratorio newLab) {
        return this.laboratorioRepository.findById(newLab.getCodLab())
                .map(lab -> {
                    lab.setNomLarLab(newLab.getNomLarLab());
                    lab.setDirecLab(newLab.getDirecLab());
                    lab.setRucLab(newLab.getRucLab());
                    lab.setNomCorLab(newLab.getNomCorLab());
                    lab.setTelefLab(newLab.getTelefLab());
                    lab.setTipoMarcaLab(newLab.getTipoMarcaLab());
                    lab.setFecModLab(newLab.getFecModLab());
                    lab.setUsuModLab(newLab.getUsuModLab());
                    return this.laboratorioRepository.save(lab);
                }).orElseThrow(() -> new BusinessException("Laboratorio codLab not found: " + newLab.getCodLab()));
    }

    public List<Laboratorio> findAllLabs(String estLab) {
        return this.laboratorioRepository.findAllByEstLabOrderByNomLarLab(estLab);
    }
}
