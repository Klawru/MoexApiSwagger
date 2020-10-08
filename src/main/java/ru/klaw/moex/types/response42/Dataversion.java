package ru.klaw.moex.types.response42;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Dataversion {

    @JsonProperty("dataVersion")
    Integer dataVersion;
    @JsonProperty("seqnum")
    Long seqnum;

}