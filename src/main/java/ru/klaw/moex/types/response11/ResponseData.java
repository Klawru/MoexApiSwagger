package ru.klaw.moex.types.response11;

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
        "engines", "markets", "boards", "boardgroups", "durations", "securitytypes", "securitygroups",
        "securitycollections"
})
public class ResponseData {

    @JsonProperty("engines")
    List<Engines> engines;
    @JsonProperty("markets")
    List<Markets> markets;
    @JsonProperty("boards")
    List<Boards> boards;
    @JsonProperty("boardgroups")
    List<Boardgroups> boardgroups;
    @JsonProperty("durations")
    List<Durations> durations;
    @JsonProperty("securitytypes")
    List<Securitytypes> securitytypes;
    @JsonProperty("securitygroups")
    List<Securitygroups> securitygroups;
    @JsonProperty("securitycollections")
    List<Securitycollections> securitycollections;

}
