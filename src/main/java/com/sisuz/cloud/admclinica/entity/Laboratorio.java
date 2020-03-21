package com.sisuz.cloud.admclinica.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(schema = "SISUZ_WEB", name = "SZ_MARCA_LAB")
public class Laboratorio implements Serializable {

    @Id
    @Column(name = "COD_LAB")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LaboratorioSeq")
    @SequenceGenerator(name = "LaboratorioSeq", sequenceName = "SEQ_SZ_MARCA_LAB", allocationSize = 1)
    private Long codLab;

    @Size(max = 150)
    @Column(name = "NOM_LAR_LAB")
    private String nomLarLab;

    @Size(max = 50)
    @Column(name = "NOM_COR_LAB")
    private String nomCorLab;

    @Size(max = 120)
    @Column(name = "DIREC_LAB")
    private String direcLab;

    @Size(max = 20)
    @Column(name = "TELEF_LAB")
    private String telefLab;

    @Size(max = 11)
    @Column(name = "RUC_LAB")
    private String rucLab;

    @Column(name = "TIP_MARCA_LAB")
    private Integer tipoMarcaLab;

    @Size(max = 1)
    @Column(name = "EST_LAB")
    private String estLab;

    @Column(name = "FEC_CREA_LAB")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecCreaLab;

    @Column(name = "USU_CREA_LAB")
    private Integer usuCreaLab;

    @Column(name = "FEC_MOD_LAB")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecModLab;

    @Column(name = "USU_MOD_LAB")
    private Integer usuModLab;

    public Laboratorio() {
    }
}
