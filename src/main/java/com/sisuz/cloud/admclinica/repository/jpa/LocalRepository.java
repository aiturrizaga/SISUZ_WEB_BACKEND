package com.sisuz.cloud.admclinica.repository.jpa;

import com.sisuz.cloud.admclinica.entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long> {

    List<Local> findAllByEstLocal(String estLocal);
}
