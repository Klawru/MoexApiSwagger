package ru.klaw.moex.types.response26;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.micronaut.core.annotation.Introspected;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Introspected
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({
        "securities", "marketdata", "marketdata_yields"
})
public class ResponseData {

    @JsonProperty("securities")
    List<Securities> securities;
    @JsonProperty("marketdata")
    List<Marketdata> marketdata;
    @JsonProperty("marketdata_yields")
    List<MarketdataYields> marketdataYields;

}
