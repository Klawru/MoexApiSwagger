package ru.klaw.moex.types.response115;

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
        "ticker", "ticker.cursor"
})
public class ResponseData {

    @JsonProperty("ticker")
    List<Ticker> ticker;
    @JsonProperty("ticker.cursor")
    List<TickerCursor> tickerCursor;

}
