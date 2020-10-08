package ru.klaw.moex.types.response124;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class IndicatorFilters {

    @JsonProperty("title")
    String title;
    @JsonProperty("dateFrom")
    LocalDate dateFrom;
    @JsonProperty("dateTill")
    LocalDate dateTill;

}