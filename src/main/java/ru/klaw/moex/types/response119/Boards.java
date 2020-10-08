package ru.klaw.moex.types.response119;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Boards {

    @JsonProperty("boardid")
    String boardid;
    @JsonProperty("title")
    String title;

}