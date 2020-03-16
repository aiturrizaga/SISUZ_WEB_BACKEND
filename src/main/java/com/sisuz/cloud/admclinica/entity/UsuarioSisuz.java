package com.sisuz.cloud.admclinica.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(schema = "VENTA_CLINICABV", name = "USU_SISUZ")
public class UsuarioSisuz implements Serializable {

    @Id
    @Column(name = "COD_USU")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "UsuarioSisuzSeq")
    @SequenceGenerator(name = "UsuarioSisuzSeq", sequenceName = "SEQ_USU_SISUZ", allocationSize = 1)
    private Long codUsu;

    @Column(name = "NOM_USU")
    private String nomUsu;

    @Column(name = "PASS_USU")
    private String passUsu;

    @Column(name = "EMAIL_USU")
    private String emailUsu;

    @Column(name = "TIP_SIST")
    private String tipoSist;

    @Column(name = "CONFIRM_USU")
    private String confirmUsu;

    @Column(name = "TIP_DOC_PER")
    private Integer tipDocPer;

    @Column(name = "NRO_DOC_PER")
    private String nroDocPer;

    @Column(name = "NOM_PER")
    private String nomPer;

    @Column(name = "APE_PER")
    private String apePer;

    @Column(name = "TELEF_PER")
    private String telefPer;

    @Column(name = "GEN_PER")
    private String genPer;

    @Column(name = "FEC_NAC_PER")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fecNacPer;

    @Column(name = "EST_USU")
    private String estUsu;

    public UsuarioSisuz() {
    }

    public UsuarioSisuz(Long codUsu, String nomUsu, String passUsu, String emailUsu, String tipoSist, String confirmUsu, Integer tipDocPer, String nroDocPer, String nomPer, String apePer, String telefPer, String genPer, LocalDate fecNacPer, String estUsu) {
        this.codUsu = codUsu;
        this.nomUsu = nomUsu;
        this.passUsu = passUsu;
        this.emailUsu = emailUsu;
        this.tipoSist = tipoSist;
        this.confirmUsu = confirmUsu;
        this.tipDocPer = tipDocPer;
        this.nroDocPer = nroDocPer;
        this.nomPer = nomPer;
        this.apePer = apePer;
        this.telefPer = telefPer;
        this.genPer = genPer;
        this.fecNacPer = fecNacPer;
        this.estUsu = estUsu;
    }
}
