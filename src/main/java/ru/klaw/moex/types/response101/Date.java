package ru.klaw.moex.types.response101;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Date {

    @JsonProperty("days")
    String days;
    @JsonProperty("tradedate")
    String tradedate;
    @JsonProperty("wadepsrate")
    Double wadepsrate;
    @JsonProperty("wareporate")
    Double wareporate;
    @JsonProperty("wareporatefixn")
    Double wareporatefixn;
    @JsonProperty("title")
    String title;
    @JsonProperty("decimals")
    Long decimals;

}