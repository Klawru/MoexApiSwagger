package ru.klaw.moex.types.response121;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

@Introspected
@Data

public class Securities {

    @JsonProperty("secid")
    String secid;
    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("boardid")
    String boardid;
    @JsonProperty("currencyid")
    String currencyid;
    @JsonProperty("open")
    Double open;
    @JsonProperty("high")
    Double high;
    @JsonProperty("low")
    Double low;
    @JsonProperty("close")
    Double close;
    @JsonProperty("waprice")
    Double waprice;
    @JsonProperty("marketprice2")
    Double marketprice2;
    @JsonProperty("admittedquote")
    Double admittedquote;
    @JsonProperty("trendclose")
    Double trendclose;
    @JsonProperty("trendwap")
    Double trendwap;
    @JsonProperty("trendwappr")
    Double trendwappr;
    @JsonProperty("volume")
    Double volume;
    @JsonProperty("value")
    Double value;
    @JsonProperty("numtrades")
    Integer numtrades;
    @JsonProperty("openval")
    Double openval;
    @JsonProperty("closeval")
    Double closeval;
    @JsonProperty("issuesize")
    Double issuesize;
    @JsonProperty("facevalue")
    Double facevalue;
    @JsonProperty("dailycapitalization")
    Double dailycapitalization;
    @JsonProperty("monthlycapitalization")
    Double monthlycapitalization;
    @JsonProperty("mp2valtrd")
    Double mp2valtrd;
    @JsonProperty("admittedvalue")
    Double admittedvalue;
    @JsonProperty("marketprice3")
    Double marketprice3;
    @JsonProperty("marketprice3tradesvalue")
    Double marketprice3tradesvalue;
    @JsonProperty("listname")
    String listname;
    @JsonProperty("systime")
    LocalDateTime systime;
    @JsonProperty("tradingsession")
    Integer tradingsession;

}