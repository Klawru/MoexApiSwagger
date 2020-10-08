package ru.klaw.moex.types.response102;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Securities {

    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("secid")
    String secid;
    @JsonProperty("liquidity")
    String liquidity;
    @JsonProperty("sigma")
    Double sigma;
    @JsonProperty("beta")
    Double beta;
    @JsonProperty("fPlus")
    Double fPlus;
    @JsonProperty("fMinus")
    Double fMinus;
    @JsonProperty("spread")
    Double spread;
    @JsonProperty("coeffC")
    Double coeffC;

}