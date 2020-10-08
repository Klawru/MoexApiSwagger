package ru.klaw.moex.types.response0;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Securities {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("secid")
    String secid;
    @JsonProperty("shortname")
    String shortname;
    @JsonProperty("regnumber")
    String regnumber;
    @JsonProperty("name")
    String name;
    @JsonProperty("isin")
    String isin;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonProperty("isTraded")
    boolean isTraded;
    @JsonProperty("emitentId")
    Integer emitentId;
    @JsonProperty("emitentTitle")
    String emitentTitle;
    @JsonProperty("emitentInn")
    String emitentInn;
    @JsonProperty("emitentOkpo")
    String emitentOkpo;
    @JsonProperty("gosreg")
    String gosreg;
    @JsonProperty("type")
    String type;
    @JsonProperty("group")
    String group;
    @JsonProperty("primaryBoardid")
    String primaryBoardid;
    @JsonProperty("marketpriceBoardid")
    String marketpriceBoardid;

}