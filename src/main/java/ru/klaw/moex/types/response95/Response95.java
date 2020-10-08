package ru.klaw.moex.types.response95;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.klaw.moex.types.utility.CharsetInfo;

@Introspected
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonPropertyOrder({
        "charsetinfo",
        "data"
})
public class Response95 {

    @JsonProperty("charsetinfo")
    CharsetInfo charsetInfo;

    @JsonProperty("data")
    ResponseData data;
}
