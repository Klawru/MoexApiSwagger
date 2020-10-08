package ru.klaw.moex.types.response95;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Coefficients {

    @JsonProperty("secid")
    String secid;
    @JsonProperty("fxsecid")
    String fxsecid;
    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("coeffCorrelation")
    Double coeffCorrelation;
    @JsonProperty("coeffBeta")
    Double coeffBeta;

}