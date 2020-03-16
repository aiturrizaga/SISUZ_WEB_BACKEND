package com.sisuz.cloud.admclinica.repository.jpa;

import com.sisuz.cloud.admclinica.entity.UsuarioSisuz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioSisuzRepository extends JpaRepository<UsuarioSisuz, Long> {

    UsuarioSisuz findByNomUsu(String username);

    List<UsuarioSisuz> findAllByEstUsu(String estUsu);
}
