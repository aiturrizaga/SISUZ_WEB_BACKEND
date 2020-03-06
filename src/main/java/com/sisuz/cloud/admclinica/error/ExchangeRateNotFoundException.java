package com.sisuz.cloud.admclinica.error;

public class ExchangeRateNotFoundException extends RuntimeException {

    public ExchangeRateNotFoundException(Long id) {
        super("Exchange rate id not found: " + id);
    }
}
