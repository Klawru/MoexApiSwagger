package ru.klaw.moex.types.response111;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Indices {

    @JsonProperty("indexid")
    String indexid;
    @JsonProperty("shortname")
    String shortname;
    @JsonProperty("from")
    LocalDate from;
    @JsonProperty("till")
    LocalDate till;

}