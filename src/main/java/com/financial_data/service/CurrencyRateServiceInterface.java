package com.financial_data.service;

import com.financial_data.entity.CurrencyRates;

import java.time.LocalDate;

public interface CurrencyRateServiceInterface {

    CurrencyRates getCurrencyRatesByDate(LocalDate date);
}
