package ru.klaw.moex.types.response14;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Securities {

    @JsonProperty("secid")
    String secid;
    @JsonProperty("shortname")
    String shortname;
    @JsonProperty("name")
    String name;
    @JsonProperty("boardid")
    String boardid;
    @JsonProperty("decimals")
    Integer decimals;
    @JsonProperty("historyFrom")
    LocalDate historyFrom;
    @JsonProperty("historyTill")
    LocalDate historyTill;

}