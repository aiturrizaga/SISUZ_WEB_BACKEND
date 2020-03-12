package com.sisuz.cloud.admclinica.service.jpa;

import com.sisuz.cloud.admclinica.entity.Local;
import com.sisuz.cloud.admclinica.error.LocalNotFoundException;
import com.sisuz.cloud.admclinica.repository.jpa.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalService {

    @Autowired
    private LocalRepository localRepository;

    public List<Local> findLocal(String estLocal) {
        return this.localRepository.findAllByEstLocal(estLocal);
    }

    public Local saveLocal(Local newLocal) {
        return this.localRepository.save(newLocal);
    }

    public Local updateLocal(Local newLocal) {
        return this.localRepository.findById(newLocal.getCodLocal())
                .map(local -> {
                    local.setDescLocal(newLocal.getDescLocal());
                    local.setDescCortaLocal(newLocal.getDescCortaLocal());
                    local.setDirecLocal(newLocal.getDirecLocal());
                    local.setDirecCortaLocal(newLocal.getDirecCortaLocal());
                    local.setTelefLocal(newLocal.getTelefLocal());
                    local.setEmailLocal(newLocal.getEmailLocal());
                    local.setCodUbigeo(newLocal.getCodUbigeo());
                    local.setLatLocal(newLocal.getLatLocal());
                    local.setLongLocal(newLocal.getLongLocal());
                    local.setFecModLocal(newLocal.getFecModLocal());
                    local.setUsuModLocal(newLocal.getUsuModLocal());
                    return this.localRepository.save(local);
                }).orElseThrow(() -> new LocalNotFoundException(newLocal.getCodLocal()));
    }

}
