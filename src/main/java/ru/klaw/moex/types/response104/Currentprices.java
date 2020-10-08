package ru.klaw.moex.types.response104;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

@Introspected
@Data

public class Currentprices {

    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("boardid")
    String boardid;
    @JsonProperty("secid")
    String secid;
    @JsonProperty("tradetime")
    LocalTime tradetime;
    @JsonProperty("curprice")
    Double curprice;
    @JsonProperty("lastprice")
    Double lastprice;
    @JsonProperty("legalclose")
    Double legalclose;
    @JsonProperty("tradingsession")
    Integer tradingsession;

}