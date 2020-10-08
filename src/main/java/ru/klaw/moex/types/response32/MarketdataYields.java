package ru.klaw.moex.types.response32;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class MarketdataYields {

    @JsonProperty("boardid")
    String boardid;
    @JsonProperty("secid")
    String secid;

}