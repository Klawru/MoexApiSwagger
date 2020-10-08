package ru.klaw.moex.types.response30;

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
        "trades", "trades_yields"
})
public class ResponseData {

    @JsonProperty("trades")
    List<Trades> trades;
    @JsonProperty("trades_yields")
    List<TradesYields> tradesYields;

}
