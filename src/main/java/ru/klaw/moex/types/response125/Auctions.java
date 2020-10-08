package ru.klaw.moex.types.response125;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Auctions {

    @JsonProperty("days")
    String days;
    @JsonProperty("title")
    String title;
    @JsonProperty("directRepoRate")
    Double directRepoRate;
    @JsonProperty("directRepoTradedate")
    LocalDate directRepoTradedate;
    @JsonProperty("lombardRate")
    Double lombardRate;
    @JsonProperty("lombardTradedate")
    LocalDate lombardTradedate;
    @JsonProperty("depositRate")
    Double depositRate;
    @JsonProperty("depositTradedate")
    LocalDate depositTradedate;

}