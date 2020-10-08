package ru.klaw.moex.types.response11;

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
    @JsonProperty("engineId")
    Integer engineId;
    @JsonProperty("marketId")
    Integer marketId;
    @JsonProperty("boardid")
    String boardid;
    @JsonProperty("boardTitle")
    String boardTitle;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isTraded")
    boolean isTraded;
    @JsonProperty("hasCandles")
    Integer hasCandles;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isPrimary")
    boolean isPrimary;

}