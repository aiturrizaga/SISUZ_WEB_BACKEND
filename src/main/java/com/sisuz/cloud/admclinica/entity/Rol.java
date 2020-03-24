package com.sisuz.cloud.admclinica.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(schema = "SISUZ_WEB", name = "SZ_ROL")
public class Rol implements Serializable {

    @Id
    @Column(name = "COD_ROL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RolSeq")
    @SequenceGenerator(name = "RolSeq", sequenceName = "SEQ_SZ_ROL", allocationSize = 1)
    private Long codRol;

    @Size(max = 30)
    @Column(name = "DESC_ROL")
    private String descRol;

    @Size(max = 1)
    @Column(name = "VER_ROL")
    private String verRol;

    @Size(max = 1)
    @Column(name = "EST_ROL")
    private String estRol;

    @Column(name = "FEC_CREA_ROL")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecCreaRol;

    @Column(name = "USU_CREA_ROL")
    private Integer usuCreRol;

    @Column(name = "FEC_MOD_ROL")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecModRol;

    @Column(name = "USU_MOD_ROL")
    private Integer usuModRol;

    @Size(max = 2)
    @Column(name = "TIP_ROL")
    private String tipRol;

    public Rol() {
    }

    public Rol(Long codRol, String descRol, String verRol, String estRol, LocalDateTime fecCreaRol, Integer usuCreRol, LocalDateTime fecModRol, Integer usuModRol, String tipRol) {
        this.codRol = codRol;
        this.descRol = descRol;
        this.verRol = verRol;
        this.estRol = estRol;
        this.fecCreaRol = fecCreaRol;
        this.usuCreRol = usuCreRol;
        this.fecModRol = fecModRol;
        this.usuModRol = usuModRol;
        this.tipRol = tipRol;
    }
}
