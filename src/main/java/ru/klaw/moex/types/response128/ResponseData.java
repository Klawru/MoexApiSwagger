package ru.klaw.moex.types.response128;

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
        "columns", "data"
})
public class ResponseData {

    @JsonProperty("columns")
    List<Columns> columns;
    @JsonProperty("data")
    List<DataInterval> dataInterval;

}
