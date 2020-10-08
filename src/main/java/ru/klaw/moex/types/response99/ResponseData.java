package ru.klaw.moex.types.response99;

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
        "data", "data.cursor", "data.dates"
})
public class ResponseData {

    @JsonProperty("data")
    List<DataInterval> dataInterval;
    @JsonProperty("data.cursor")
    List<DataCursor> dataCursor;
    @JsonProperty("data.dates")
    List<DataDates> dataDates;

}
