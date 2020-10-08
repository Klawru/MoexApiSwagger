package ru.klaw.moex.types.response113;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Analytics {

    @JsonProperty("indexid")
    String indexid;
    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("ticker")
    String ticker;
    @JsonProperty("shortnames")
    String shortnames;
    @JsonProperty("secids")
    String secids;
    @JsonProperty("weight")
    Double weight;

}