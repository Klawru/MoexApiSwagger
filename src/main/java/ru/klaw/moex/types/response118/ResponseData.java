package ru.klaw.moex.types.response118;

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
        "capitalization", "issuecapitalization"
})
public class ResponseData {

    @JsonProperty("capitalization")
    List<Capitalization> capitalization;
    @JsonProperty("issuecapitalization")
    List<Issuecapitalization> issuecapitalization;

}
