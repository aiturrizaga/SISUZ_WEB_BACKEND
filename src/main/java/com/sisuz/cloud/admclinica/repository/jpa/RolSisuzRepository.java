package com.sisuz.cloud.admclinica.repository.jpa;

import com.sisuz.cloud.admclinica.entity.RolSisuz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolSisuzRepository extends JpaRepository<RolSisuz, Long> {

    List<RolSisuz> findAllByEstRolAndVerRol(String estRol, String verRol);
}
