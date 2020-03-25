package com.sisuz.cloud.admclinica.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(schema = "SISUZ_WEB", name = "SZ_CARGO")
public class Cargo implements Serializable {

    @Id
    @Column(name = "COD_CARGO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CargoSeq")
    @SequenceGenerator(name = "CargoSeq", sequenceName = "SEQ_SZ_CARGO", allocationSize = 1)
    private Integer codCargo;

    @Column(name = "NOM_CARGO")
    private String nomCargo;

    @Column(name = "EST_CARGO")
    private String estCargo;

    @Column(name = "USU_CREA")
    private Long usuCrea;

    @Column(name = "FEC_CREA")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecCrea;

    @Column(name = "USU_MOD")
    private Long usuMod;

    @Column(name = "FEC_MOD")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecMod;

    public Cargo() {
    }

    public Cargo(Integer codCargo, String nomCargo, String estCargo, Long usuCrea, LocalDateTime fecCrea, Long usuMod, LocalDateTime fecMod) {
        this.codCargo = codCargo;
        this.nomCargo = nomCargo;
        this.estCargo = estCargo;
        this.usuCrea = usuCrea;
        this.fecCrea = fecCrea;
        this.usuMod = usuMod;
        this.fecMod = fecMod;
    }
}
