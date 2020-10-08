package ru.klaw.moex.types.response11;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Boardgroups {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("tradeEngineId")
    Integer tradeEngineId;
    @JsonProperty("tradeEngineName")
    String tradeEngineName;
    @JsonProperty("tradeEngineTitle")
    String tradeEngineTitle;
    @JsonProperty("marketId")
    Integer marketId;
    @JsonProperty("marketName")
    String marketName;
    @JsonProperty("name")
    String name;
    @JsonProperty("title")
    String title;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isDefault")
    boolean isDefault;
    @JsonProperty("boardGroupId")
    Integer boardGroupId;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isTraded")
    boolean isTraded;

}