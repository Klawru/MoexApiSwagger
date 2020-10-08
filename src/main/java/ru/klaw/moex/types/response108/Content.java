package ru.klaw.moex.types.response108;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDateTime;
import lombok.Data;

@Introspected
@Data

public class Content {

    @JsonProperty("id")
    Long id;
    @JsonProperty("title")
    String title;
    @JsonProperty("from")
    LocalDateTime from;
    @JsonProperty("till")
    LocalDateTime till;
    @JsonProperty("body")
    String body;
    @JsonProperty("organizer")
    String organizer;
    @JsonProperty("place")
    String place;

}