package ru.klaw.moex.types.response9;

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
        "parameters", "values", "parameters.dates", "intraday", "yields", "base", "model"
})
public class ResponseData {

    @JsonProperty("parameters")
    List<Parameters> parameters;
    @JsonProperty("values")
    List<Values> values;
    @JsonProperty("parameters.dates")
    List<ParametersDates> parametersDates;
    @JsonProperty("intraday")
    List<Intraday> intraday;
    @JsonProperty("yields")
    List<Yields> yields;
    @JsonProperty("base")
    List<Base> base;
    @JsonProperty("model")
    List<Model> model;

}
