package com.financial_data.config;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties("bank.nbp")
public class NbpProperties {

    @NotNull
    private String url;
    private String tableA;
    private String tableB;
    private boolean enabled;
    private int publicHour;
    private long rangeOfDates;

    private String getUrlForTableA(){
        return url.replace("{tableA}", tableA);
    }

    private String getUrlForTableB(){
        return url.replace("{tableA}", tableB);
    }
}
