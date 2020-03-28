package com.sisuz.cloud.admclinica.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(schema = "SISUZ_WEB", name = "SZ_EMPRESA")
public class Empresa implements Serializable {

    @Id
    @Column(name = "RUC_EMPRESA")
    private String ruc;

    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "FECHA_ANIVERSARIO")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDateTime fecAniversario;

    @Column(name = "FECHA_FACTURACION")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDateTime fecFacturacion;

    @Column(name = "EMAIL_CONTACTO")
    private String emailContacto;

    @Column(name = "TELEFONO_CONTACTO")
    private String telefContacto;

    @Column(name = "OBSERVACION")
    private String observacion;

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

    public Empresa() {
    }

    public Empresa(String ruc, String razonSocial, String direccion, LocalDateTime fecAniversario, LocalDateTime fecFacturacion, String emailContacto, String telefContacto, String observacion, String estado, LocalDateTime fecCrea, Long usuCrea, LocalDateTime fecMod, Long usuMod) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.fecAniversario = fecAniversario;
        this.fecFacturacion = fecFacturacion;
        this.emailContacto = emailContacto;
        this.telefContacto = telefContacto;
        this.observacion = observacion;
        this.estado = estado;
        this.fecCrea = fecCrea;
        this.usuCrea = usuCrea;
        this.fecMod = fecMod;
        this.usuMod = usuMod;
    }
}
