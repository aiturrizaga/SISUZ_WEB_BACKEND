package com.sisuz.cloud.admclinica.error;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super("Error: " + message);
    }
}
