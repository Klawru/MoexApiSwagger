package ru.klaw.moex.types.response31;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Boards {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("boardGroupId")
    Integer boardGroupId;
    @JsonProperty("boardid")
    String boardid;
    @JsonProperty("title")
    String title;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isTraded")
    boolean isTraded;

}