package com.sisuz.cloud.admclinica.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(schema = "VENTA_CLINICABV", name = "CE_TIPO_CAMBIO")
public class TipoCambio implements Serializable {

    @Id
    @Column(name = "COD_TIPO_CAMBIO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TipoCambioSeq")
    @SequenceGenerator(name = "TipoCambioSeq", sequenceName = "SEQ_TIPO_CAMBIO", allocationSize = 1)
    private Long codTipoCambio;

    @Column(name = "COD_GRUPO_CIA")
    private String codGrupoCia;

    @Column(name = "VAL_TIPO_CAMBIO")
    private BigDecimal valTipoCambio;

    @Column(name = "FEC_INI_VIG")
    private String fecIniVig;

    @Column(name = "FEC_FIN_VIG")
    private String fecFinVig;

    @Size(max = 1)
    @Column(name = "EST_TIPO_CAMBIO")
    private String estTipoCambio;

    @Column(name = "FEC_CREA_TIPO_CAMBIO")
    private String fecCreaTipoCambio;

    @Column(name = "USU_CREA_TIPO_CAMBIO")
    private String usuCreaTipoCambio;

    @Column(name = "FEC_MOD_TIPO_CAMBIO")
    private String fecModTipoCambio;

    @Column(name = "USU_MOD_TIPO_CAMBIO")
    private String usuModTipoCambio;

    public TipoCambio() {
    }
}
