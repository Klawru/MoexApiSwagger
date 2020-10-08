package ru.klaw.moex.types.response17;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Engine {

    @JsonProperty("name")
    String name;
    @JsonProperty("title")
    String title;
    @JsonProperty("shortTitle")
    String shortTitle;

}