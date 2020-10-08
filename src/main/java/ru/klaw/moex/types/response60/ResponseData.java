package ru.klaw.moex.types.response60;

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
        "orderbook", "dataversion"
})
public class ResponseData {

    @JsonProperty("orderbook")
    List<Orderbook> orderbook;
    @JsonProperty("dataversion")
    List<Dataversion> dataversion;

}
