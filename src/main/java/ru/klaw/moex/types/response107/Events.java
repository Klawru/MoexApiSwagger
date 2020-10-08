package ru.klaw.moex.types.response107;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDateTime;
import lombok.Data;

@Introspected
@Data

public class Events {

    @JsonProperty("id")
    Long id;
    @JsonProperty("tag")
    String tag;
    @JsonProperty("title")
    String title;
    @JsonProperty("from")
    LocalDateTime from;
    @JsonProperty("modifiedAt")
    LocalDateTime modifiedAt;

}