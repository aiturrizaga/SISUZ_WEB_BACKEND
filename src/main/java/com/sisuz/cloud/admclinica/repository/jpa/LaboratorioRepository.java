package com.sisuz.cloud.admclinica.repository.jpa;

import com.sisuz.cloud.admclinica.entity.Laboratorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaboratorioRepository extends JpaRepository<Laboratorio, String> {

    List<Laboratorio> findAllByEstLabOrderByNomLarLab(String estLab);
}
