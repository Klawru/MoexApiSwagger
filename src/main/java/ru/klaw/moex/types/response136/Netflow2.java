package ru.klaw.moex.types.response136;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Netflow2 {

    @JsonProperty("date")
    LocalDate date;
    @JsonProperty("ticker")
    String ticker;
    @JsonProperty("p30")
    Long p30;
    @JsonProperty("p70")
    Long p70;
    @JsonProperty("p100")
    Long p100;
    @JsonProperty("pv30")
    Long pv30;
    @JsonProperty("pv70")
    Long pv70;
    @JsonProperty("pv100")
    Long pv100;
    @JsonProperty("vol")
    Long vol;
    @JsonProperty("oi")
    Long oi;

}