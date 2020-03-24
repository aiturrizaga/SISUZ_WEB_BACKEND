package com.sisuz.cloud.admclinica.service.jpa;

import com.sisuz.cloud.admclinica.entity.Rol;
import com.sisuz.cloud.admclinica.repository.jpa.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public Rol newRol(Rol rol) {
        return this.rolRepository.save(rol);
    }

    public List<Rol> findAllRoles(String estRol) {
        return this.rolRepository.findAllByEstRolAndVerRol(estRol, "S");
    }
}
