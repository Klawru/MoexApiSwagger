package ru.klaw.moex.types.response49;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDateTime;
import lombok.Data;

@Introspected
@Data

public class Borders {

    @JsonProperty("begin")
    LocalDateTime begin;
    @JsonProperty("end")
    LocalDateTime end;
    @JsonProperty("interval")
    Integer interval;
    @JsonProperty("boardGroupId")
    Integer boardGroupId;

}