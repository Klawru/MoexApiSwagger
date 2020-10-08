package ru.klaw.moex.types.response122;

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
        "security", "security.cursor", "security.dates"
})
public class ResponseData {

    @JsonProperty("security")
    List<Security> security;
    @JsonProperty("security.cursor")
    List<SecurityCursor> securityCursor;
    @JsonProperty("security.dates")
    List<SecurityDates> securityDates;

}
