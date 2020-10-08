package ru.klaw.moex.types.response5;

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
        "turnovers", "turnoversprevdate", "turnoverssectors", "turnoverssectorsprevdate"
})
public class ResponseData {

    @JsonProperty("turnovers")
    List<Turnovers> turnovers;
    @JsonProperty("turnoversprevdate")
    List<Turnoversprevdate> turnoversprevdate;
    @JsonProperty("turnoverssectors")
    List<Turnoverssectors> turnoverssectors;
    @JsonProperty("turnoverssectorsprevdate")
    List<Turnoverssectorsprevdate> turnoverssectorsprevdate;

}
