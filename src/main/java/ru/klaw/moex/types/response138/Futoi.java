package ru.klaw.moex.types.response138;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import lombok.Data;

@Introspected
@Data

public class Futoi {

    @JsonProperty("sessId")
    Integer sessId;
    @JsonProperty("seqnum")
    Integer seqnum;
    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("tradetime")
    LocalTime tradetime;
    @JsonProperty("ticker")
    String ticker;
    @JsonProperty("clgroup")
    String clgroup;
    @JsonProperty("pos")
    Long pos;
    @JsonProperty("posLong")
    Long posLong;
    @JsonProperty("posShort")
    Long posShort;
    @JsonProperty("posLongNum")
    Long posLongNum;
    @JsonProperty("posShortNum")
    Long posShortNum;
    @JsonProperty("systime")
    LocalDateTime systime;

}