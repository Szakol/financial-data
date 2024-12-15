package com.financial_data.service;

import com.financial_data.entity.CurrencyRates;
import com.financial_data.mapper.NnpMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public abstract class AbstractNbpService implements CurrencyRateServiceInterface{

    private final RestTemplate restTemplate;
    private final NnpMapper mapper;
    private final String url;

    @Override
    public CurrencyRates getCurrencyRatesByDate(LocalDate date) {
        return null;
    }

    public ExchangeRatesTable getCurrencyByDate(LocalDate date){
        return ArrayOfExchangeRates arrayOfExchageReates = HttpU
    }
}
