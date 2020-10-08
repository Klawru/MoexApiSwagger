package ru.klaw.moex.types.response123;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Irr {

    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("group")
    String group;
    @JsonProperty("indicator")
    String indicator;
    @JsonProperty("instrument")
    String instrument;
    @JsonProperty("isin")
    String isin;
    @JsonProperty("currencyid")
    String currencyid;
    @JsonProperty("rH")
    Double rH;
    @JsonProperty("rL")
    Double rL;
    @JsonProperty("rS")
    Double rS;
    @JsonProperty("d")
    Double d;
    @JsonProperty("sgnr")
    Integer sgnr;

}