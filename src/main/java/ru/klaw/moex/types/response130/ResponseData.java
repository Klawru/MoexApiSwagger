package ru.klaw.moex.types.response130;

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
        "securities", "securities.dates"
})
public class ResponseData {

    @JsonProperty("securities")
    List<Securities> securities;
    @JsonProperty("securities.dates")
    List<SecuritiesDates> securitiesDates;

}
