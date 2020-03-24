package com.sisuz.cloud.admclinica.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(schema = "SISUZ_WEB", name = "SZ_USU_ROL")
public class UsuarioRol implements Serializable {

    @Id
    @Column(name = "SEC_USU_ROL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "UsuarioRolSeq")
    @SequenceGenerator(name = "UsuarioRolSeq", sequenceName = "SEQ_SZ_USU_ROL", allocationSize = 1)
    private Long secUsuRol;

    @Column(name = "COD_USU")
    private Long codUsu;

    @Column(name = "COD_ROL", nullable = false)
    private Long codRol;

    @Column(name = "FEC_CREA")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecCrea;

    @Column(name = "USU_CREA")
    private Long usuCrea;

    @Column(name = "FEC_MOD")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecMod;

    @Column(name = "USU_MOD")
    private Long usuMod;

    public UsuarioRol() {
    }

    public UsuarioRol(Long codUsu, Long codRol, LocalDateTime fecCrea, Long usuCrea, LocalDateTime fecMod, Long usuMod) {
        this.codUsu = codUsu;
        this.codRol = codRol;
        this.fecCrea = fecCrea;
        this.usuCrea = usuCrea;
        this.fecMod = fecMod;
        this.usuMod = usuMod;
    }
}
