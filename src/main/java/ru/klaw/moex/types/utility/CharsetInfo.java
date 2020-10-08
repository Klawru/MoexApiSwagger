package ru.klaw.moex.types.utility;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CharsetInfo {

    @JsonProperty("charsetinfo")
    CharsetInfoData charsetInfoData;
}
