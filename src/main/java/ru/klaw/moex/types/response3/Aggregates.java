package ru.klaw.moex.types.response3;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Aggregates {

    @JsonProperty("marketName")
    String marketName;
    @JsonProperty("marketTitle")
    String marketTitle;
    @JsonProperty("engine")
    String engine;
    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("secid")
    String secid;
    @JsonProperty("value")
    Double value;
    @JsonProperty("volume")
    Long volume;
    @JsonProperty("numtrades")
    Long numtrades;

}