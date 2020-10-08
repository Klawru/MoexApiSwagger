package ru.klaw.moex.types.response91;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Boardgroups {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("name")
    String name;
    @JsonProperty("title")
    String title;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isTraded")
    boolean isTraded;

}