package ru.klaw.moex.types.response98;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Splits {

    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("secid")
    String secid;
    @JsonProperty("before")
    Integer before;
    @JsonProperty("after")
    Integer after;

}