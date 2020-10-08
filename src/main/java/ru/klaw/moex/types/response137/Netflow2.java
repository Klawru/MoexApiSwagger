package ru.klaw.moex.types.response137;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Netflow2 {

    @JsonProperty("errorMessage")
    String errorMessage;

}