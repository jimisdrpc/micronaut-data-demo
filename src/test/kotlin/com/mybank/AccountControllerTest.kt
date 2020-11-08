//package com.mybank
//
//import io.micronaut.http.HttpRequest
//import io.micronaut.http.client.RxStreamingHttpClient
//import io.micronaut.http.client.annotation.Client
//import io.micronaut.test.extensions.junit5.annotation.MicronautTest
//import org.junit.jupiter.api.Assertions.assertEquals
//import org.junit.jupiter.api.Test
//import javax.inject.Inject
//
//
//@MicronautTest
//class AccountControllerTest {
//    @Inject
//    @field:Client("/")
//    lateinit var client : RxStreamingHttpClient
//
//
//    @Test
//    fun testIndex() {
//        val request = HttpRequest.GET<String>("/accounts")
//        assertEquals("teste",
//                client.toBlocking().exchange(request, String::class.java).body())
//    }
//}