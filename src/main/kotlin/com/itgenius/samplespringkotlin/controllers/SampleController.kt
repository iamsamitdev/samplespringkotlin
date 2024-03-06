package com.itgenius.samplespringkotlin.controllers

import com.itgenius.samplespringkotlin.models.Sampledata
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/api/sample")
class SampleController {

    // GET:  http://localhost:8080/api/sample/hello
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello Spring Boot from SampleController 888"
    }

    // GET:  http://localhost:8080/api/sample
    @GetMapping
    fun getSample(): List<Sampledata> {
        return listOf(
            Sampledata(1, "John Doe", "jonh@email.com", "0895544587", "Bangkok"),
            Sampledata(2, "Jane Doe", "jane@email.com", "0895544588", "Nan"),
            Sampledata(3, "Jim Doe", "jim@email.com", "0895544589", "Chiang Mai")
        )
    }

    // GET: http://localhost:8080/api/sample/1
    @GetMapping("/{id}")
    fun getSampleById(@PathVariable id: Int): Sampledata {
        return Sampledata(
            id, "John Doe", "john@email.com", "0812345678", "Bangkok 10110"
        )
    }

    // Post: http://localhost:8080/api/sample
    @PostMapping
    fun createSample(@RequestBody sampledata: Sampledata): Sampledata {
        return sampledata
    }

    // Put: http://localhost:8080/api/sample/1
    @PutMapping("/{id}")
    fun updateSample(@PathVariable id: Int, @RequestBody sampledata: Sampledata): Sampledata {
        return sampledata.copy(id = id)
    }

    // Delete: http://localhost:8080/api/sample/1
    @DeleteMapping("/{id}")
    fun deleteSample(@PathVariable id: Int): String {
        return "Sample ID $id has been deleted"
    }

}