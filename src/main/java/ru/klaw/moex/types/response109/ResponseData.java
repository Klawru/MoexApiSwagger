package ru.klaw.moex.types.response109;

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
        "aggregates", "aggregates.dates"
})
public class ResponseData {

    @JsonProperty("aggregates")
    List<Aggregates> aggregates;
    @JsonProperty("aggregates.dates")
    List<AggregatesDates> aggregatesDates;

}
