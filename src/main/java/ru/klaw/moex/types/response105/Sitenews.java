package ru.klaw.moex.types.response105;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDateTime;
import lombok.Data;

@Introspected
@Data

public class Sitenews {

    @JsonProperty("id")
    Long id;
    @JsonProperty("tag")
    String tag;
    @JsonProperty("title")
    String title;
    @JsonProperty("publishedAt")
    LocalDateTime publishedAt;
    @JsonProperty("modifiedAt")
    LocalDateTime modifiedAt;

}