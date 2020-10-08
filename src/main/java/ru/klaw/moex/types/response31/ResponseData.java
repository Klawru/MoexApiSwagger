package ru.klaw.moex.types.response31;

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
        "boards", "boardgroups", "securities", "marketdata", "trades", "orderbook", "history", "trades_hist",
        "marketdata_yields", "trades_yields", "history_yields"
})
public class ResponseData {

    @JsonProperty("boards")
    List<Boards> boards;
    @JsonProperty("boardgroups")
    List<Boardgroups> boardgroups;
    @JsonProperty("securities")
    List<Securities> securities;
    @JsonProperty("marketdata")
    List<Marketdata> marketdata;
    @JsonProperty("trades")
    List<Trades> trades;
    @JsonProperty("orderbook")
    List<Orderbook> orderbook;
    @JsonProperty("history")
    List<History> history;
    @JsonProperty("trades_hist")
    List<TradesHist> tradesHist;
    @JsonProperty("marketdata_yields")
    List<MarketdataYields> marketdataYields;
    @JsonProperty("trades_yields")
    List<TradesYields> tradesYields;
    @JsonProperty("history_yields")
    List<HistoryYields> historyYields;

}
