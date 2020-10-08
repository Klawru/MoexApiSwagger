package ru.klaw.moex.types.response130;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Securities {

    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("tradetime")
    String tradetime;
    @JsonProperty("secid")
    String secid;
    @JsonProperty("rate")
    Double rate;

}