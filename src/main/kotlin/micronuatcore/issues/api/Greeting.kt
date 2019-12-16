package micronuatcore.issues.api

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

class Greeting @JsonCreator constructor(
        @JsonProperty("id") val id: Long,
        @JsonProperty("content") val content: String,
        val temp: String?) {

}