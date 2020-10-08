package ru.klaw.moex.types.response72;

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
        "history", "history.cursor"
})
public class ResponseData {

    @JsonProperty("history")
    List<History> history;
    @JsonProperty("history.cursor")
    List<HistoryCursor> historyCursor;

}
