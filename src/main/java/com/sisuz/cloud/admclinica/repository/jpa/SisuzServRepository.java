package com.sisuz.cloud.admclinica.repository.jpa;

import com.sisuz.cloud.admclinica.entity.SisuzServ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SisuzServRepository extends JpaRepository<SisuzServ, Long> {

    List<SisuzServ> findAllByEstServ(String estServ);
}
