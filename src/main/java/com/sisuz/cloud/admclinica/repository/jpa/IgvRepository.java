package com.sisuz.cloud.admclinica.repository.jpa;

import com.sisuz.cloud.admclinica.entity.Igv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IgvRepository extends JpaRepository<Igv, Long> {

    Igv findByEstIgv(String estIgv);

    List<Igv> findAllByEstIgvOrderByFecCreaIgvDesc(String estIgv);

}
