package ru.klaw.moex.types.response11;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Securitytypes {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("tradeEngineId")
    Integer tradeEngineId;
    @JsonProperty("tradeEngineName")
    String tradeEngineName;
    @JsonProperty("tradeEngineTitle")
    String tradeEngineTitle;
    @JsonProperty("securityTypeName")
    String securityTypeName;
    @JsonProperty("securityTypeTitle")
    String securityTypeTitle;

}