package ru.klaw.moex.types.response10;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

@Introspected
@Data

public class Params {

    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("tradetime")
    LocalTime tradetime;
    @JsonProperty("b1")
    Double b1;
    @JsonProperty("b2")
    Double b2;
    @JsonProperty("b3")
    Double b3;
    @JsonProperty("t1")
    Double t1;
    @JsonProperty("g1")
    Double g1;
    @JsonProperty("g2")
    Double g2;
    @JsonProperty("g3")
    Double g3;
    @JsonProperty("g4")
    Double g4;
    @JsonProperty("g5")
    Double g5;
    @JsonProperty("g6")
    Double g6;
    @JsonProperty("g7")
    Double g7;
    @JsonProperty("g8")
    Double g8;
    @JsonProperty("g9")
    Double g9;

}