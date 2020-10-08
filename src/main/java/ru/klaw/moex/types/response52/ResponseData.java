package ru.klaw.moex.types.response52;

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
        "borders", "durations"
})
public class ResponseData {

    @JsonProperty("borders")
    List<Borders> borders;
    @JsonProperty("durations")
    List<Durations> durations;

}
