package ru.klaw.moex.types.response109;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Aggregates {

    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("typeBond")
    String typeBond;
    @JsonProperty("issNominal")
    Double issNominal;
    @JsonProperty("volNominalO")
    Double volNominalO;
    @JsonProperty("volNominalR")
    Double volNominalR;
    @JsonProperty("volPriceTradeO")
    Double volPriceTradeO;
    @JsonProperty("volPriceTradeR")
    Double volPriceTradeR;
    @JsonProperty("coeffNominalO")
    Double coeffNominalO;
    @JsonProperty("coeffNominalR")
    Double coeffNominalR;
    @JsonProperty("avgYears")
    Double avgYears;
    @JsonProperty("decimals")
    Long decimals;

}