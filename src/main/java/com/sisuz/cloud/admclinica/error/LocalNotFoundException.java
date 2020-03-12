package com.sisuz.cloud.admclinica.error;

public class LocalNotFoundException extends RuntimeException {

    public LocalNotFoundException(Long id) {
        super("Local id not found: " + id);
    }
}
