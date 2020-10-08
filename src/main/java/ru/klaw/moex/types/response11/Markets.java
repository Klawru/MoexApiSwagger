package ru.klaw.moex.types.response11;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Markets {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("tradeEngineId")
    Integer tradeEngineId;
    @JsonProperty("tradeEngineName")
    String tradeEngineName;
    @JsonProperty("tradeEngineTitle")
    String tradeEngineTitle;
    @JsonProperty("marketName")
    String marketName;
    @JsonProperty("marketTitle")
    String marketTitle;
    @JsonProperty("marketId")
    Integer marketId;
    @JsonProperty("marketplace")
    String marketplace;

}