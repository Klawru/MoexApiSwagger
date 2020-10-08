package ru.klaw.moex.types.response52;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Durations {

    @JsonProperty("interval")
    Integer interval;
    @JsonProperty("duration")
    Integer duration;
    @JsonProperty("days")
    Integer days;
    @JsonProperty("title")
    String title;
    @JsonProperty("hint")
    String hint;

}