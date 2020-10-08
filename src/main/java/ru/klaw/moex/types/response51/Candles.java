package ru.klaw.moex.types.response51;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDateTime;
import lombok.Data;

@Introspected
@Data

public class Candles {

    @JsonProperty("open")
    Double open;
    @JsonProperty("close")
    Double close;
    @JsonProperty("high")
    Double high;
    @JsonProperty("low")
    Double low;
    @JsonProperty("value")
    Double value;
    @JsonProperty("volume")
    Double volume;
    @JsonProperty("begin")
    LocalDateTime begin;
    @JsonProperty("end")
    LocalDateTime end;

}