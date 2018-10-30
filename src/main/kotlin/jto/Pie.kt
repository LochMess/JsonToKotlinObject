package jto

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

@JsonSerialize
@JsonDeserialize
data class Pie(
    @JsonProperty val flavour: String,
    @JsonProperty val ingredients: String,
    @JsonProperty val durability: String
) {
}