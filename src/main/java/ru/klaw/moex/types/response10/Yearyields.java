package ru.klaw.moex.types.response10;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

@Introspected
@Data

public class Yearyields {

    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("tradetime")
    LocalTime tradetime;
    @JsonProperty("period")
    Double period;
    @JsonProperty("value")
    Double value;

}