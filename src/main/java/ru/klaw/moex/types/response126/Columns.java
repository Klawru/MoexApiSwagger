package ru.klaw.moex.types.response126;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Columns {

    @JsonProperty("name")
    String name;
    @JsonProperty("shortTitle")
    String shortTitle;
    @JsonProperty("title")
    String title;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isOrdered")
    boolean isOrdered;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isSystem")
    boolean isSystem;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isHidden")
    boolean isHidden;
    @JsonProperty("trendBy")
    Long trendBy;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isSigned")
    boolean isSigned;
    @JsonProperty("hasPercent")
    Long hasPercent;
    @JsonProperty("type")
    String type;
    @JsonProperty("precision")
    String precision;
    @JsonProperty("alias")
    String alias;

}