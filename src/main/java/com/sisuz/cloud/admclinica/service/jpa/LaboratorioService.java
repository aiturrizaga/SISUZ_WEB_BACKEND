package com.sisuz.cloud.admclinica.service.jpa;

import com.sisuz.cloud.admclinica.entity.Laboratorio;
import com.sisuz.cloud.admclinica.repository.jpa.LaboratorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaboratorioService {

    @Autowired
    private LaboratorioRepository laboratorioRepository;

    public Laboratorio saveLab(Laboratorio laboratorio) {
        return this.laboratorioRepository.save(laboratorio);
    }

    public List<Laboratorio> findAllLabs(String estLab) {
        return this.laboratorioRepository.findAllByEstLabOrderByNomLarLab(estLab);
    }
}
