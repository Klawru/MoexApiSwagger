package ru.klaw.moex.types.response10;

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
        "maxdates", "params", "params.dates", "securities", "securities.dates", "yearyields", "yearyields.dates"
})
public class ResponseData {

    @JsonProperty("maxdates")
    List<Maxdates> maxdates;
    @JsonProperty("params")
    List<Params> params;
    @JsonProperty("params.dates")
    List<ParamsDates> paramsDates;
    @JsonProperty("securities")
    List<Securities> securities;
    @JsonProperty("securities.dates")
    List<SecuritiesDates> securitiesDates;
    @JsonProperty("yearyields")
    List<Yearyields> yearyields;
    @JsonProperty("yearyields.dates")
    List<YearyieldsDates> yearyieldsDates;

}
