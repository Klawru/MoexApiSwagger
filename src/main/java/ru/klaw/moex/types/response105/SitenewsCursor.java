package ru.klaw.moex.types.response105;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class SitenewsCursor {

    @JsonProperty("index")
    Long index;
    @JsonProperty("total")
    Long total;
    @JsonProperty("pagesize")
    Long pagesize;

}