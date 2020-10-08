package ru.klaw.moex.types.response118;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Capitalization {

    @JsonProperty("capitalization")
    Double capitalization;
    @JsonProperty("tradedate")
    LocalDate tradedate;

}