package ru.klaw.moex.types.response103;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Quotedsecurities {

    @JsonProperty("tradedate")
    LocalDate tradedate;
    @JsonProperty("secid")
    String secid;
    @JsonProperty("name")
    String name;
    @JsonProperty("isin")
    String isin;
    @JsonProperty("regnumber")
    String regnumber;
    @JsonProperty("mainboardid")
    String mainboardid;
    @JsonProperty("listlevel")
    String listlevel;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isQuoted")
    boolean isQuoted;

}