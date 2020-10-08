package ru.klaw.moex.types.response117;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Waitlist {

    @JsonProperty("ticker")
    String ticker;
    @JsonProperty("freeFloat")
    Double freeFloat;
    @JsonProperty("emitentName")
    String emitentName;
    @JsonProperty("secType")
    String secType;
    @JsonProperty("days")
    Integer days;
    @JsonProperty("tradeDays")
    Integer tradeDays;
    @JsonProperty("nonTradeDays")
    Integer nonTradeDays;
    @JsonProperty("valueAv")
    Double valueAv;
    @JsonProperty("numtradesAv")
    Double numtradesAv;
    @JsonProperty("cap")
    Double cap;
    @JsonProperty("k")
    Double k;
    @JsonProperty("capPercent")
    Double capPercent;
    @JsonProperty("secs")
    String secs;
    @JsonProperty("secsname")
    String secsname;

}