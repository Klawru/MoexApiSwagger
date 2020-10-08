package ru.klaw.moex.types.response95;

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
        "coefficients", "coefficients.cursor", "coefficients.dates"
})
public class ResponseData {

    @JsonProperty("coefficients")
    List<Coefficients> coefficients;
    @JsonProperty("coefficients.cursor")
    List<CoefficientsCursor> coefficientsCursor;
    @JsonProperty("coefficients.dates")
    List<CoefficientsDates> coefficientsDates;

}
