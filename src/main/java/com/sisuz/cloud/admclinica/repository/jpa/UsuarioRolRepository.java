package com.sisuz.cloud.admclinica.repository.jpa;

import com.sisuz.cloud.admclinica.entity.UsuarioRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRolRepository extends JpaRepository<UsuarioRol, Long> {
}
