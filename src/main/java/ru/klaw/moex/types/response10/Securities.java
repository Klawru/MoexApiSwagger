package ru.klaw.moex.types.response10;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

@Introspected
@Data

public class Securities {

    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("tradetime")
    LocalTime tradetime;
    @JsonProperty("secid")
    String secid;
    @JsonProperty("benchmark")
    Integer benchmark;
    @JsonProperty("expdate")
    LocalDate expdate;
    @JsonProperty("updatetime")
    LocalTime updatetime;
    @JsonProperty("bidprice")
    Double bidprice;
    @JsonProperty("bidyield")
    Double bidyield;
    @JsonProperty("askprice")
    Double askprice;
    @JsonProperty("askyield")
    Double askyield;
    @JsonProperty("trdprice")
    Double trdprice;
    @JsonProperty("trdyield")
    Double trdyield;
    @JsonProperty("clcprice")
    Double clcprice;
    @JsonProperty("crtprice")
    Double crtprice;
    @JsonProperty("clcyield")
    Double clcyield;
    @JsonProperty("correction")
    Double correction;
    @JsonProperty("crtyield")
    Double crtyield;
    @JsonProperty("shortname")
    String shortname;

}