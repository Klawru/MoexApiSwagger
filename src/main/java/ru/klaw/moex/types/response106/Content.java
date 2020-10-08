package ru.klaw.moex.types.response106;

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
    @JsonProperty("publishedAt")
    LocalDateTime publishedAt;
    @JsonProperty("body")
    String body;

}