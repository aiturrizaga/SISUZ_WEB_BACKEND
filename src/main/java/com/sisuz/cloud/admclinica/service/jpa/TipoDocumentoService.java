package com.sisuz.cloud.admclinica.service.jpa;

import com.sisuz.cloud.admclinica.entity.TipoDocumento;
import com.sisuz.cloud.admclinica.repository.jpa.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoService {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    public List<TipoDocumento> findAllTipDoc() {
        return this.tipoDocumentoRepository.findAllByEstado("A");
    }
}
