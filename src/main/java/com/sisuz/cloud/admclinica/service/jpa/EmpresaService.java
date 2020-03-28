package com.sisuz.cloud.admclinica.service.jpa;

import com.sisuz.cloud.admclinica.entity.Empresa;
import com.sisuz.cloud.admclinica.repository.jpa.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public Empresa newCompany(Empresa empresa) {
        return this.empresaRepository.save(empresa);
    }
}
