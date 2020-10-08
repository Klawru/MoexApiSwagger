package ru.klaw.moex.types.response42;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDateTime;
import java.time.LocalTime;
import lombok.Data;

@Introspected
@Data

public class Trades {

    @JsonProperty("tradeno")
    Long tradeno;
    @JsonProperty("tradetime")
    LocalTime tradetime;
    @JsonProperty("boardid")
    String boardid;
    @JsonProperty("secid")
    String secid;
    @JsonProperty("price")
    Double price;
    @JsonProperty("quantity")
    Integer quantity;
    @JsonProperty("value")
    Double value;
    @JsonProperty("period")
    String period;
    @JsonProperty("tradetimeGrp")
    Integer tradetimeGrp;
    @JsonProperty("systime")
    LocalDateTime systime;
    @JsonProperty("buysell")
    String buysell;
    @JsonProperty("decimals")
    Integer decimals;
    @JsonProperty("tradingsession")
    String tradingsession;

}