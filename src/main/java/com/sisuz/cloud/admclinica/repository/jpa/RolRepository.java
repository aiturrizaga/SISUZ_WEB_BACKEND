package com.sisuz.cloud.admclinica.repository.jpa;

import com.sisuz.cloud.admclinica.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {

    List<Rol> findAllByEstRolAndVerRol(String estRol, String verRol);
}
