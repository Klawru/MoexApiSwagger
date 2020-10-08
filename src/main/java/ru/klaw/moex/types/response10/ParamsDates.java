package ru.klaw.moex.types.response10;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class ParamsDates {

    @JsonProperty("from")
    LocalDate from;
    @JsonProperty("till")
    LocalDate till;

}