package ru.klaw.moex.types.response99;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class DataCursor {

    @JsonProperty("index")
    String index;
    @JsonProperty("total")
    Long total;
    @JsonProperty("pagesize")
    Long pagesize;

}