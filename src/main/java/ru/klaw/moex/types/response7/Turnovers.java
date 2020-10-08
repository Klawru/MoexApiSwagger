package ru.klaw.moex.types.response7;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDateTime;
import lombok.Data;

@Introspected
@Data

public class Turnovers {

    @JsonProperty("name")
    String name;
    @JsonProperty("id")
    Integer id;
    @JsonProperty("valtoday")
    Double valtoday;
    @JsonProperty("valtodayUsd")
    Double valtodayUsd;
    @JsonProperty("numtrades")
    Long numtrades;
    @JsonProperty("updatetime")
    LocalDateTime updatetime;
    @JsonProperty("title")
    String title;

}