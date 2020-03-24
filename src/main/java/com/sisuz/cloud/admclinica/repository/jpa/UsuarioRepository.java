package com.sisuz.cloud.admclinica.repository.jpa;

import com.sisuz.cloud.admclinica.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByNomUsu(String username);

    List<Usuario> findAllByEstUsu(String estUsu);
}
