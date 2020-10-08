package ru.klaw.moex.types.response115;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Ticker {

    @JsonProperty("indexid")
    String indexid;
    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("ticker")
    String ticker;
    @JsonProperty("shortnames")
    String shortnames;
    @JsonProperty("secids")
    String secids;
    @JsonProperty("waprice")
    Double waprice;
    @JsonProperty("issueSizeTotal")
    Double issueSizeTotal;
    @JsonProperty("capTotal")
    Double capTotal;
    @JsonProperty("ffFactor")
    Double ffFactor;
    @JsonProperty("wFactor")
    Double wFactor;
    @JsonProperty("issueSizeIndex")
    Double issueSizeIndex;
    @JsonProperty("capIndex")
    Double capIndex;
    @JsonProperty("weight")
    Double weight;
    @JsonProperty("value")
    Double value;
    @JsonProperty("numTrades")
    Long numTrades;
    @JsonProperty("volatility")
    Double volatility;
    @JsonProperty("factora")
    Double factora;
    @JsonProperty("factorb")
    Double factorb;
    @JsonProperty("influence")
    Double influence;
    @JsonProperty("determinat")
    Double determinat;

}