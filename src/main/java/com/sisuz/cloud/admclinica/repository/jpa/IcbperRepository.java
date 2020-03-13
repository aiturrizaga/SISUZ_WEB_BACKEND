package com.sisuz.cloud.admclinica.repository.jpa;

import com.sisuz.cloud.admclinica.entity.Icbper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IcbperRepository extends JpaRepository<Icbper, Long> {

    Icbper findByEstIcbperAndFecModIcbperIsNull(String estIcbper);

    List<Icbper> findAllByEstIcbperAndFecFinVigIsNotNullOrderByFecIniVigDesc(String estIcbper);
}
