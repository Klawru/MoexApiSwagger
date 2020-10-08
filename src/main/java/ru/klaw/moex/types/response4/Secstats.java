package ru.klaw.moex.types.response4;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalTime;
import lombok.Data;

@Introspected
@Data

public class Secstats {

    @JsonProperty("secid")
    String secid;
    @JsonProperty("boardid")
    String boardid;
    @JsonProperty("tradingsession")
    String tradingsession;
    @JsonProperty("time")
    LocalTime time;
    @JsonProperty("priceminusprevwaprice")
    Double priceminusprevwaprice;
    @JsonProperty("voltoday")
    Long voltoday;
    @JsonProperty("valtoday")
    Long valtoday;
    @JsonProperty("highbid")
    Double highbid;
    @JsonProperty("lowoffer")
    Double lowoffer;
    @JsonProperty("lastoffer")
    Double lastoffer;
    @JsonProperty("lastbid")
    Double lastbid;
    @JsonProperty("open")
    Double open;
    @JsonProperty("low")
    Double low;
    @JsonProperty("high")
    Double high;
    @JsonProperty("last")
    Double last;
    @JsonProperty("lcloseprice")
    Double lcloseprice;
    @JsonProperty("numtrades")
    Long numtrades;
    @JsonProperty("waprice")
    Double waprice;
    @JsonProperty("admittedquote")
    Double admittedquote;
    @JsonProperty("marketprice2")
    Double marketprice2;
    @JsonProperty("lcurrentprice")
    Double lcurrentprice;
    @JsonProperty("closingauctionprice")
    Double closingauctionprice;

}