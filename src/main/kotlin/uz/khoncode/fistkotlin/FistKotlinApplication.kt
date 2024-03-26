package uz.khoncode.fistkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FistKotlinApplication

fun main(args: Array<String>) {
    runApplication<FistKotlinApplication>(*args)

    println("HELLO KOTLIN")
}
