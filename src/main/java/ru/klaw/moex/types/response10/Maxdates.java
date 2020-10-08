package ru.klaw.moex.types.response10;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Maxdates {

    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("maxdate")
    LocalDate maxdate;
    @JsonProperty("months")
    Integer months;

}