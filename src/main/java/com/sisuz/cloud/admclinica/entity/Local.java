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
@Table(schema = "VENTA_CLINICABV", name = "PBL_LOCAL_WEB")
public class Local implements Serializable {

    @Id
    @Column(name = "COD_LOCAL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LocalSeq")
    @SequenceGenerator(name = "LocalSeq", sequenceName = "SEQ_LOCAL", allocationSize = 1)
    private Long codLocal;

    @Column(name = "COD_GRUPO_CIA")
    private String codGrupoCia;

    @Size(max = 120)
    @Column(name = "DESC_LOCAL")
    private String descLocal;

    @Size(max = 30)
    @Column(name = "DESC_CORTA_LOCAL")
    private String descCortaLocal;

    @Size(max = 120)
    @Column(name = "DIREC_LOCAL")
    private String direcLocal;

    @Size(max = 50)
    @Column(name = "DIREC_CORTA_LOCAL")
    private String direcCortaLocal;

    @Size(max = 20)
    @Column(name = "TELEF_LOCAL")
    private String telefLocal;

    @Size(max = 50)
    @Column(name = "EMAIL_LOCAL")
    private String emailLocal;

    @Column(name = "COD_UBIGEO")
    private String codUbigeo;

    @Column(name = "LAT_LOCAL")
    private BigDecimal latLocal;

    @Column(name = "LONG_LOCAL")
    private BigDecimal longLocal;

    @Size(max = 1)
    @Column(name = "EST_LOCAL")
    private String estLocal;

    @Column(name = "FEC_CREA_LOCAL")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecCreaLocal;

    @Column(name = "USU_CREA_LOCAL")
    private Integer usuCreaLocal;

    @Column(name = "FEC_MOD_LOCAL")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecModLocal;

    @Column(name = "USU_MOD_LOCAL")
    private Integer usuModLocal;

    public Local() {
    }
}
