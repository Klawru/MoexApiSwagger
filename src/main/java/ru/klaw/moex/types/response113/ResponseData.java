package ru.klaw.moex.types.response113;

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
        "analytics", "analytics.cursor", "analytics.dates"
})
public class ResponseData {

    @JsonProperty("analytics")
    List<Analytics> analytics;
    @JsonProperty("analytics.cursor")
    List<AnalyticsCursor> analyticsCursor;
    @JsonProperty("analytics.dates")
    List<AnalyticsDates> analyticsDates;

}
