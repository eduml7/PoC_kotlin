package es.waltitocorp.votador

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class VotadorApplication

fun main(args: Array<String>) {
    SpringApplication.run(VotadorApplication::class.java, *args)
}
