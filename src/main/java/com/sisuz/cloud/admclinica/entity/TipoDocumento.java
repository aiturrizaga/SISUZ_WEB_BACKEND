package com.sisuz.cloud.admclinica.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(schema = "SISUZ_WEB", name = "SZ_TIPO_DOCUMENTO")
public class TipoDocumento implements Serializable {

    @Id
    @Column(name = "TIP_DOCUMENTO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TipoDocumentoSeq")
    @SequenceGenerator(name = "TipoDocumentoSeq", sequenceName = "SEQ_SZ_TIPO_DOCUMENTO", allocationSize = 1)
    private Integer tipDoc;

    @Column(name = "DESC_DOCUMENTO")
    private String descDoc;

    @Column(name = "ESTADO")
    private String estado;

    @Column(name = "FEC_CREA")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecCrea;

    @Column(name = "USU_CREA")
    private Long usuCrea;

    @Column(name = "FEC_MOD")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fecMod;

    @Column(name = "USU_MOD")
    private Long usuMod;

    public TipoDocumento() {
    }

    public TipoDocumento(Integer tipDoc, String descDoc, String estado, LocalDateTime fecCrea, Long usuCrea, LocalDateTime fecMod, Long usuMod) {
        this.tipDoc = tipDoc;
        this.descDoc = descDoc;
        this.estado = estado;
        this.fecCrea = fecCrea;
        this.usuCrea = usuCrea;
        this.fecMod = fecMod;
        this.usuMod = usuMod;
    }
}
