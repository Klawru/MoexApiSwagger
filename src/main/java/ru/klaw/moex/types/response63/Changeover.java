package ru.klaw.moex.types.response63;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Changeover {

    @JsonProperty("actionDate")
    LocalDate actionDate;
    @JsonProperty("oldSecid")
    String oldSecid;
    @JsonProperty("newSecid")
    String newSecid;

}