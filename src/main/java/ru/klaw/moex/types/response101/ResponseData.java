package ru.klaw.moex.types.response101;

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
        "date", "dates"
})
public class ResponseData {

    @JsonProperty("date")
    List<Date> date;
    @JsonProperty("dates")
    List<Dates> dates;

}
