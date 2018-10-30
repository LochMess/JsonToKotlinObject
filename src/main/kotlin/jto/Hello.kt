package jto

import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule

/**
 * https://github.com/FasterXML/jackson-module-kotlin
 * https://github.com/FasterXML/jackson-module-kotlin/issues/170
 */


fun main(args: Array<String>) {
    println("Hello, World")
    val pie = Pie(
        flavour = "coffee",
        ingredients = "egg",
        durability = "yes"
    )
    val mapper: ObjectMapper = ObjectMapper()
    val pieJsonString = mapper.writeValueAsString(pie)
    println(pieJsonString)
    try {
        val pieFromJsonString = mapper.registerModules(KotlinModule())
            .readValue(pieJsonString, Pie::class.java)
        println(pieFromJsonString)
    }
    catch (e: JsonMappingException) {
        println(e)
    }
}



