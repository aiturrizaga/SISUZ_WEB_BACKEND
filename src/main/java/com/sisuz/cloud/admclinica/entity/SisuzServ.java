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
@Table(schema = "SISUZ_WEB", name = "SZ_SERVICIOS")
public class SisuzServ implements Serializable {

    @Id
    @Column(name = "COD_SERV_SISUZ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SisuzServSeq")
    @SequenceGenerator(name = "SisuzServSeq", sequenceName = "SEQ_SZ_SERVICIOS", allocationSize = 1)
    private Long codServSisuz;

    @Column(name = "NOM_SERV")
    private String nomServ;

    @Column(name = "MONTO_PUB_SERV")
    private BigDecimal montoPubServ;

    @Column(name = "MONTO_MIN_SERV")
    private BigDecimal montoMinServ;

    @Size(max = 50)
    @Column(name = "RESP_SERV")
    private String respServ;

    @Column(name = "FEC_CREA_SERV")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecCreaServ;

    @Column(name = "USU_CREA_SERV")
    private Integer usuCreaServ;

    @Column(name = "FEC_MOD_SERV")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecModServ;

    @Column(name = "USU_MOD_SERV")
    private Integer usuModServ;

    @Size(max = 1)
    @Column(name = "EST_SERV")
    private String estServ;

    public SisuzServ() {
    }
}
