package com.sisuz.cloud.admclinica.repository.jpa;

import com.sisuz.cloud.admclinica.entity.TipoCambio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoCambioRepository extends JpaRepository<TipoCambio, Long> {

    TipoCambio findByEstTipoCambioAndFecModTipoCambioIsNull(String estTipoCambio);

    List<TipoCambio> findAllByEstTipoCambioAndFecFinVigIsNotNull(String estTipoCambio);

}
