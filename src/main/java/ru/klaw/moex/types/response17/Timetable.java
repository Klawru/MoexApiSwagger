package ru.klaw.moex.types.response17;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalTime;
import lombok.Data;

@Introspected
@Data

public class Timetable {

    @JsonProperty("weekDay")
    Integer weekDay;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isWorkDay")
    boolean isWorkDay;
    @JsonProperty("startTime")
    LocalTime startTime;
    @JsonProperty("stopTime")
    LocalTime stopTime;

}