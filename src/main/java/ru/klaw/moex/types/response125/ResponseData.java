package ru.klaw.moex.types.response125;

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
        "auctions", "fixed"
})
public class ResponseData {

    @JsonProperty("auctions")
    List<Auctions> auctions;
    @JsonProperty("fixed")
    List<Fixed> fixed;

}
