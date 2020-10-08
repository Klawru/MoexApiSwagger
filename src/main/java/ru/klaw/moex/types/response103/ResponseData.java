package ru.klaw.moex.types.response103;

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
        "quotedsecurities", "quotedsecurities.dates"
})
public class ResponseData {

    @JsonProperty("quotedsecurities")
    List<Quotedsecurities> quotedsecurities;
    @JsonProperty("quotedsecurities.dates")
    List<QuotedsecuritiesDates> quotedsecuritiesDates;

}
