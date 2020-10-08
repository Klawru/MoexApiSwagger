package ru.klaw.moex.types.response1;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDate;
import lombok.Data;

@Introspected
@Data

public class Boards {

    @JsonProperty("secid")
    String secid;
    @JsonProperty("boardid")
    String boardid;
    @JsonProperty("title")
    String title;
    @JsonProperty("boardGroupId")
    Integer boardGroupId;
    @JsonProperty("marketId")
    Integer marketId;
    @JsonProperty("market")
    String market;
    @JsonProperty("engineId")
    Integer engineId;
    @JsonProperty("engine")
    String engine;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isTraded")
    boolean isTraded;
    @JsonProperty("decimals")
    Integer decimals;
    @JsonProperty("historyFrom")
    LocalDate historyFrom;
    @JsonProperty("historyTill")
    LocalDate historyTill;
    @JsonProperty("listedFrom")
    LocalDate listedFrom;
    @JsonProperty("listedTill")
    LocalDate listedTill;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isPrimary")
    boolean isPrimary;
    @JsonProperty("currencyid")
    String currencyid;

}