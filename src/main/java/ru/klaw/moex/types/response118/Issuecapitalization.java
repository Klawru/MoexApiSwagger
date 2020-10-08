package ru.klaw.moex.types.response118;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Issuecapitalization {

    @JsonProperty("issuecapitalization")
    Double issuecapitalization;
    @JsonProperty("updatetime")
    String updatetime;

}