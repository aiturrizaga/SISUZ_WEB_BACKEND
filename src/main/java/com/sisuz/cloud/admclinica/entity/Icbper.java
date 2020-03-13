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
@Table(schema = "VENTA_CLINICABV", name = "PBL_ICBPER_WEB")
public class Icbper implements Serializable {

    @Id
    @Column(name = "COD_ICBPER")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IcbperSeq")
    @SequenceGenerator(name = "IcbperSeq", sequenceName = "SEQ_PBL_ICBPER", allocationSize = 1)
    private Long codIcbper;

    @Column(name = "VALOR_ICBPER")
    private BigDecimal valorIcbper;

    @Column(name = "FEC_INI_VIG")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecIniVig;

    @Column(name = "FEC_FIN_VIG")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecFinVig;

    @Column(name = "FEC_CREA_ICBPER")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecCreaIcbper;

    @Column(name = "USU_CREA_ICBPER")
    private Integer usuCreaIcbper;

    @Column(name = "FEC_MOD_ICBPER")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecModIcbper;

    @Column(name = "USU_MOD_ICBPER")
    private Integer usuModIcbper;

    @Size(max = 1)
    @Column(name = "EST_ICBPER")
    private String estIcbper;

    public Icbper() {
    }

    public Icbper(Long codIcbper, BigDecimal valorIcbper, LocalDateTime fecIniVig, LocalDateTime fecFinVig, LocalDateTime fecCreaIcbper, Integer usuCreaIcbper, LocalDateTime fecModIcbper, Integer usuModIcbper, String estIcbper) {
        this.codIcbper = codIcbper;
        this.valorIcbper = valorIcbper;
        this.fecIniVig = fecIniVig;
        this.fecFinVig = fecFinVig;
        this.fecCreaIcbper = fecCreaIcbper;
        this.usuCreaIcbper = usuCreaIcbper;
        this.fecModIcbper = fecModIcbper;
        this.usuModIcbper = usuModIcbper;
        this.estIcbper = estIcbper;
    }
}
