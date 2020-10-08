package ru.klaw.moex.types.response105;

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
        "sitenews", "sitenews.cursor"
})
public class ResponseData {

    @JsonProperty("sitenews")
    List<Sitenews> sitenews;
    @JsonProperty("sitenews.cursor")
    List<SitenewsCursor> sitenewsCursor;

}
