package ru.klaw.moex.types.response31;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Securities {

    @JsonProperty("id")
    Integer id;
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
    Integer trendBy;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isSigned")
    boolean isSigned;
    @JsonProperty("hasPercent")
    Integer hasPercent;
    @JsonProperty("type")
    String type;
    @JsonProperty("precision")
    Integer precision;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isLinked")
    boolean isLinked;

}