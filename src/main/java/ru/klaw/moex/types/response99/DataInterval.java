package ru.klaw.moex.types.response99;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class DataInterval {

    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("secid")
    String secid;
    @JsonProperty("emitent")
    String emitent;
    @JsonProperty("marketprice")
    Double marketprice;

}