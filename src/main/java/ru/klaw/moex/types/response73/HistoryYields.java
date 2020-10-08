package ru.klaw.moex.types.response73;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class HistoryYields {

    @JsonProperty("boardid")
    String boardid;
    @JsonProperty("secid")
    String secid;

}