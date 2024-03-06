package com.itgenius.samplespringkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
//import org.springframework.web.bind.annotation.GetMapping
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SamplespringkotlinApplication

//@RestController
//@RequestMapping("/")
//class HomeController {
//
//	// http://localhost:8080/hello
//	@GetMapping("/hello")
//	fun hello(): String {
//		return "Hello Spring Boot 999"
//	}
//}

fun main(args: Array<String>) {
	runApplication<SamplespringkotlinApplication>(*args)
}
