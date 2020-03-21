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
@Table(schema = "SISUZ_WEB", name = "SZ_TIPO_CAMBIO")
public class TipoCambio implements Serializable {

    @Id
    @Column(name = "SEC_TIPO_CAMBIO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TipoCambioSeq")
    @SequenceGenerator(name = "TipoCambioSeq", sequenceName = "SEQ_SZ_TIPO_CAMBIO", allocationSize = 1)
    private Long codTipoCambio;

    @Column(name = "COD_GRUPO_CIA")
    private String codGrupoCia;

    @Column(name = "VAL_TIPO_CAMBIO")
    private BigDecimal valTipoCambio;

    @Column(name = "FEC_INI_VIG")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecIniVig;

    @Column(name = "FEC_FIN_VIG")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecFinVig;

    @Size(max = 1)
    @Column(name = "EST_TIPO_CAMBIO")
    private String estTipoCambio;

    @Column(name = "FEC_CREA_TIPO_CAMBIO")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecCreaTipoCambio;

    @Column(name = "USU_CREA_TIPO_CAMBIO")
    private Integer usuCreaTipoCambio;

    @Column(name = "FEC_MOD_TIPO_CAMBIO")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecModTipoCambio;

    @Column(name = "USU_MOD_TIPO_CAMBIO")
    private Integer usuModTipoCambio;

    public TipoCambio() {
    }

    public TipoCambio(Long codTipoCambio, String codGrupoCia, BigDecimal valTipoCambio, LocalDateTime fecIniVig, LocalDateTime fecFinVig, String estTipoCambio, LocalDateTime fecCreaTipoCambio, Integer usuCreaTipoCambio, LocalDateTime fecModTipoCambio, Integer usuModTipoCambio) {
        this.codTipoCambio = codTipoCambio;
        this.codGrupoCia = codGrupoCia;
        this.valTipoCambio = valTipoCambio;
        this.fecIniVig = fecIniVig;
        this.fecFinVig = fecFinVig;
        this.estTipoCambio = estTipoCambio;
        this.fecCreaTipoCambio = fecCreaTipoCambio;
        this.usuCreaTipoCambio = usuCreaTipoCambio;
        this.fecModTipoCambio = fecModTipoCambio;
        this.usuModTipoCambio = usuModTipoCambio;
    }

}
