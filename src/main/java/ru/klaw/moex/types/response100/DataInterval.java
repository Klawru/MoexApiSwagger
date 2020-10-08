package ru.klaw.moex.types.response100;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class DataInterval {

    @JsonProperty("repodays")
    String repodays;
    @JsonProperty("decimals")
    Long decimals;
    @JsonProperty("totalvalue")
    Double totalvalue;
    @JsonProperty("numtrades")
    Integer numtrades;
    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("warate")
    Double warate;
    @JsonProperty("trendwarate")
    Double trendwarate;
    @JsonProperty("title")
    String title;

}