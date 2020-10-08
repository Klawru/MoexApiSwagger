package ru.klaw.moex.types.response124;

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
        "group.filters", "indicator.filters", "currency.filters"
})
public class ResponseData {

    @JsonProperty("group.filters")
    List<GroupFilters> groupFilters;
    @JsonProperty("indicator.filters")
    List<IndicatorFilters> indicatorFilters;
    @JsonProperty("currency.filters")
    List<CurrencyFilters> currencyFilters;

}
