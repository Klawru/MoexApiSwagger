package ru.klaw.moex.types.response1;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Description {

    @JsonProperty("name")
    String name;
    @JsonProperty("title")
    String title;
    @JsonProperty("value")
    String value;
    @JsonProperty("type")
    String type;
    @JsonProperty("sortOrder")
    Long sortOrder;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isHidden")
    boolean isHidden;
    @JsonProperty("precision")
    Long precision;

}