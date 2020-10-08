package ru.klaw.moex.types.response122;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class SecurityCursor {

    @JsonProperty("index")
    Long index;
    @JsonProperty("total")
    Long total;
    @JsonProperty("pagesize")
    Long pagesize;

}