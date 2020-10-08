package ru.klaw.moex.types.response116;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Indices {

    @JsonProperty("indexid")
    String indexid;
    @JsonProperty("shortname")
    String shortname;

}