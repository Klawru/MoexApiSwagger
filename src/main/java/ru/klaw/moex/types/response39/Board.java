package ru.klaw.moex.types.response39;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Board {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("boardGroupId")
    Integer boardGroupId;
    @JsonProperty("boardid")
    String boardid;
    @JsonProperty("title")
    String title;

}