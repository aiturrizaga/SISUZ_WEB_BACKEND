package com.sisuz.cloud.admclinica.service.jpa;

import com.sisuz.cloud.admclinica.entity.RolSisuz;
import com.sisuz.cloud.admclinica.repository.jpa.RolSisuzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolSisuzService {

    @Autowired
    private RolSisuzRepository rolSisuzRepository;

    public RolSisuz newRol(RolSisuz rol) {
        return this.rolSisuzRepository.save(rol);
    }

    public List<RolSisuz> findAllRoles(String estRol) {
        return this.rolSisuzRepository.findAllByEstRolAndVerRol(estRol, "S");
    }
}
