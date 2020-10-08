package ru.klaw.moex.types.response92;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Securities {

    @JsonProperty("secid")
    String secid;
    @JsonProperty("type")
    String type;
    @JsonProperty("typename")
    String typename;

}