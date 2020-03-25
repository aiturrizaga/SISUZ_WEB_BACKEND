package com.sisuz.cloud.admclinica.service.jpa;

import com.sisuz.cloud.admclinica.entity.Cargo;
import com.sisuz.cloud.admclinica.repository.jpa.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {

    @Autowired
    private CargoRepository cargoRepository;

    public List<Cargo> findAllCargo() {
        return this.cargoRepository.findAllByEstCargo("A");
    }
}
