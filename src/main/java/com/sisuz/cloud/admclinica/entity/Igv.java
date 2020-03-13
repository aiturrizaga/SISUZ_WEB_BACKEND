package com.sisuz.cloud.admclinica.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(schema = "VENTA_CLINICABV", name = "PBL_IGV_WEB")
public class Igv implements Serializable {

    @Id
    @Column(name = "COD_IGV")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IgvSeq")
    @SequenceGenerator(name = "IgvSeq", sequenceName = "SEQ_IGV", allocationSize = 1)
    private Long codIgv;

    @Size(max = 30)
    @Column(name = "DESC_IGV")
    private String descIgv;

    @Column(name = "PORC_IGV")
    private BigDecimal porcIgv;

    @Column(name = "FEC_CREA_IGV")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecCreaIgv;

    @Column(name = "USU_CREA_IGV")
    private Integer usuCreaIgv;

    @Column(name = "FEC_MOD_IGV")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecModIgv;

    @Column(name = "USU_MOD_IGV")
    private Integer usuModIgv;

    @Size(max = 1)
    @Column(name = "EST_IGV")
    private String estIgv;

    public Igv() {
    }

    public Igv(Long codIgv, String descIgv, BigDecimal porcIgv, LocalDateTime fecCreaIgv, Integer usuCreaIgv, LocalDateTime fecModIgv, Integer usuModIgv, String estIgv) {
        this.codIgv = codIgv;
        this.descIgv = descIgv;
        this.porcIgv = porcIgv;
        this.fecCreaIgv = fecCreaIgv;
        this.usuCreaIgv = usuCreaIgv;
        this.fecModIgv = fecModIgv;
        this.usuModIgv = usuModIgv;
        this.estIgv = estIgv;
    }

}
