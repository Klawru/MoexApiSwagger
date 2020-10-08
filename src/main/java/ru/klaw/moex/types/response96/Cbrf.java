package ru.klaw.moex.types.response96;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

@Introspected
@Data

public class Cbrf {

    @JsonProperty("usdtomUtsCloseprice")
    Double usdtomUtsCloseprice;
    @JsonProperty("usdtomUtsClosepricetoprevprcn")
    Double usdtomUtsClosepricetoprevprcn;
    @JsonProperty("usdtomUtsTradedate")
    LocalDate usdtomUtsTradedate;
    @JsonProperty("cbrfUsdLast")
    Double cbrfUsdLast;
    @JsonProperty("cbrfUsdLastchangeprcnt")
    Double cbrfUsdLastchangeprcnt;
    @JsonProperty("cbrfUsdTradedate")
    LocalDate cbrfUsdTradedate;
    @JsonProperty("cbrfEurLast")
    Double cbrfEurLast;
    @JsonProperty("cbrfEurLastchangeprcnt")
    Double cbrfEurLastchangeprcnt;
    @JsonProperty("cbrfEurTradedate")
    LocalDate cbrfEurTradedate;
    @JsonProperty("todayValtoday")
    Double todayValtoday;
    @JsonProperty("todayValtodayUsd")
    Double todayValtodayUsd;
    @JsonProperty("todayDate")
    LocalDateTime todayDate;

}