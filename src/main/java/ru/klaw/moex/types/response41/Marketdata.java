package ru.klaw.moex.types.response41;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDateTime;
import java.time.LocalTime;
import lombok.Data;

@Introspected
@Data

public class Marketdata {

    @JsonProperty("secid")
    String secid;
    @JsonProperty("boardid")
    String boardid;
    @JsonProperty("bid")
    Double bid;
    @JsonProperty("biddepth")
    String biddepth;
    @JsonProperty("offer")
    Double offer;
    @JsonProperty("offerdepth")
    String offerdepth;
    @JsonProperty("spread")
    Double spread;
    @JsonProperty("biddeptht")
    Integer biddeptht;
    @JsonProperty("offerdeptht")
    Integer offerdeptht;
    @JsonProperty("open")
    Double open;
    @JsonProperty("low")
    Double low;
    @JsonProperty("high")
    Double high;
    @JsonProperty("last")
    Double last;
    @JsonProperty("lastchange")
    Double lastchange;
    @JsonProperty("lastchangeprcnt")
    Double lastchangeprcnt;
    @JsonProperty("qty")
    Integer qty;
    @JsonProperty("value")
    Double value;
    @JsonProperty("valueUsd")
    Double valueUsd;
    @JsonProperty("waprice")
    Double waprice;
    @JsonProperty("lastcngtolastwaprice")
    Double lastcngtolastwaprice;
    @JsonProperty("waptoprevwapriceprcnt")
    Double waptoprevwapriceprcnt;
    @JsonProperty("waptoprevwaprice")
    Double waptoprevwaprice;
    @JsonProperty("closeprice")
    Double closeprice;
    @JsonProperty("marketpricetoday")
    Double marketpricetoday;
    @JsonProperty("marketprice")
    Double marketprice;
    @JsonProperty("lasttoprevprice")
    Double lasttoprevprice;
    @JsonProperty("numtrades")
    Integer numtrades;
    @JsonProperty("voltoday")
    Long voltoday;
    @JsonProperty("valtoday")
    Long valtoday;
    @JsonProperty("valtodayUsd")
    Long valtodayUsd;
    @JsonProperty("etfsettleprice")
    Double etfsettleprice;
    @JsonProperty("tradingstatus")
    String tradingstatus;
    @JsonProperty("updatetime")
    LocalTime updatetime;
    @JsonProperty("admittedquote")
    Double admittedquote;
    @JsonProperty("lastbid")
    String lastbid;
    @JsonProperty("lastoffer")
    String lastoffer;
    @JsonProperty("lcloseprice")
    Double lcloseprice;
    @JsonProperty("lcurrentprice")
    Double lcurrentprice;
    @JsonProperty("marketprice2")
    Double marketprice2;
    @JsonProperty("numbids")
    String numbids;
    @JsonProperty("numoffers")
    String numoffers;
    @JsonProperty("change")
    Double change;
    @JsonProperty("time")
    LocalTime time;
    @JsonProperty("highbid")
    String highbid;
    @JsonProperty("lowoffer")
    String lowoffer;
    @JsonProperty("priceminusprevwaprice")
    Double priceminusprevwaprice;
    @JsonProperty("openperiodprice")
    Double openperiodprice;
    @JsonProperty("seqnum")
    Long seqnum;
    @JsonProperty("systime")
    LocalDateTime systime;
    @JsonProperty("closingauctionprice")
    Double closingauctionprice;
    @JsonProperty("closingauctionvolume")
    Double closingauctionvolume;
    @JsonProperty("issuecapitalization")
    Double issuecapitalization;
    @JsonProperty("issuecapitalizationUpdatetime")
    LocalTime issuecapitalizationUpdatetime;
    @JsonProperty("etfsettlecurrency")
    String etfsettlecurrency;
    @JsonProperty("valtodayRur")
    Long valtodayRur;
    @JsonProperty("tradingsession")
    String tradingsession;

}