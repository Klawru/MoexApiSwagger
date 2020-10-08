package ru.klaw.moex.types.response40;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Securities {

    @JsonProperty("secid")
    String secid;
    @JsonProperty("boardid")
    String boardid;
    @JsonProperty("shortname")
    String shortname;
    @JsonProperty("prevprice")
    Double prevprice;
    @JsonProperty("lotsize")
    Integer lotsize;
    @JsonProperty("facevalue")
    Double facevalue;
    @JsonProperty("status")
    String status;
    @JsonProperty("boardname")
    String boardname;
    @JsonProperty("decimals")
    Integer decimals;
    @JsonProperty("secname")
    String secname;
    @JsonProperty("remarks")
    String remarks;
    @JsonProperty("marketcode")
    String marketcode;
    @JsonProperty("instrid")
    String instrid;
    @JsonProperty("sectorid")
    String sectorid;
    @JsonProperty("minstep")
    Double minstep;
    @JsonProperty("prevwaprice")
    Double prevwaprice;
    @JsonProperty("faceunit")
    String faceunit;
    @JsonProperty("prevdate")
    LocalDate prevdate;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("issuesize")
    boolean issuesize;
    @JsonProperty("isin")
    String isin;
    @JsonProperty("latname")
    String latname;
    @JsonProperty("regnumber")
    String regnumber;
    @JsonProperty("prevlegalcloseprice")
    Double prevlegalcloseprice;
    @JsonProperty("prevadmittedquote")
    Double prevadmittedquote;
    @JsonProperty("currencyid")
    String currencyid;
    @JsonProperty("sectype")
    String sectype;
    @JsonProperty("listlevel")
    Integer listlevel;
    @JsonProperty("settledate")
    LocalDate settledate;

}