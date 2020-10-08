package ru.klaw.moex.types.response123;

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
        "irr", "irr.dates"
})
public class ResponseData {

    @JsonProperty("irr")
    List<Irr> irr;
    @JsonProperty("irr.dates")
    List<IrrDates> irrDates;

}
