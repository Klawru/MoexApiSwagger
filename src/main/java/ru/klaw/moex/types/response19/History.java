package ru.klaw.moex.types.response19;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class History {

    @JsonProperty("boardid")
    String boardid;
    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("shortname")
    String shortname;
    @JsonProperty("secid")
    String secid;
    @JsonProperty("numtrades")
    Double numtrades;
    @JsonProperty("value")
    Double value;
    @JsonProperty("open")
    Double open;
    @JsonProperty("low")
    Double low;
    @JsonProperty("high")
    Double high;
    @JsonProperty("legalcloseprice")
    Double legalcloseprice;
    @JsonProperty("waprice")
    Double waprice;
    @JsonProperty("close")
    Double close;
    @JsonProperty("volume")
    Double volume;
    @JsonProperty("marketprice2")
    Double marketprice2;
    @JsonProperty("marketprice3")
    Double marketprice3;
    @JsonProperty("admittedquote")
    Double admittedquote;
    @JsonProperty("mp2valtrd")
    Double mp2valtrd;
    @JsonProperty("marketprice3tradesvalue")
    Double marketprice3tradesvalue;
    @JsonProperty("admittedvalue")
    Double admittedvalue;
    @JsonProperty("waval")
    Double waval;
    @JsonProperty("tradingsession")
    Integer tradingsession;

}