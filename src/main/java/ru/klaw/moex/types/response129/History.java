package ru.klaw.moex.types.response129;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class History {

    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("secid")
    String secid;
    @JsonProperty("rate")
    Double rate;

}