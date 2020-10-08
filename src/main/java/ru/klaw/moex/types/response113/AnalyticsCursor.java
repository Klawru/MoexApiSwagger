package ru.klaw.moex.types.response113;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class AnalyticsCursor {

    @JsonProperty("index")
    Long index;
    @JsonProperty("total")
    Long total;
    @JsonProperty("pagesize")
    Long pagesize;
    @JsonProperty("prevDate")
    String prevDate;
    @JsonProperty("nextDate")
    String nextDate;

}