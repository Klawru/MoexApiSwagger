package ru.klaw.moex.types.response17;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.micronaut.core.annotation.Introspected;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Introspected
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({
        "engine", "timetable", "dailytable"
})
public class ResponseData {

    @JsonProperty("engine")
    List<Engine> engine;
    @JsonProperty("timetable")
    List<Timetable> timetable;
    @JsonProperty("dailytable")
    List<Dailytable> dailytable;

}
