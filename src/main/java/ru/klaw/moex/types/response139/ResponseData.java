package ru.klaw.moex.types.response139;

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
        "futoi", "futoi.dates"
})
public class ResponseData {

    @JsonProperty("futoi")
    List<Futoi> futoi;
    @JsonProperty("futoi.dates")
    List<FutoiDates> futoiDates;

}
