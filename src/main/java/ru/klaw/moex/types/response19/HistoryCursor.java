package ru.klaw.moex.types.response19;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class HistoryCursor {

    @JsonProperty("index")
    Long index;
    @JsonProperty("total")
    Long total;
    @JsonProperty("pagesize")
    Long pagesize;

}