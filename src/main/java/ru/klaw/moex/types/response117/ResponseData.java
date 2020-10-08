package ru.klaw.moex.types.response117;

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
        "waitlist", "waitlist.cursor"
})
public class ResponseData {

    @JsonProperty("waitlist")
    List<Waitlist> waitlist;
    @JsonProperty("waitlist.cursor")
    List<WaitlistCursor> waitlistCursor;

}
