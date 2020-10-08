package ru.klaw.moex.types.response17;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

@Introspected
@Data

public class Dailytable {

    @JsonProperty("date")
    LocalDate date;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isWorkDay")
    boolean isWorkDay;
    @JsonProperty("startTime")
    LocalTime startTime;
    @JsonProperty("stopTime")
    LocalTime stopTime;

}