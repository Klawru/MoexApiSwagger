package ru.klaw.moex.types.response11;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data

public class Securitycollections {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("name")
    String name;
    @JsonProperty("title")
    String title;
    @JsonProperty("securityGroupId")
    Integer securityGroupId;

}