package br.com.paim.spring_boot_essentials.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/hello")
public class HelloWorldController {

//    @GetMapping
//    public String helloWorld() {
//        return "Hello World";

//    @GetMapping
//    public ResponseEntity<String> helloWorld() {
//            return ResponseEntity.ok("Hello World!");
//        }
//    @GetMapping
//    public ResponseEntity<String> helloWorld(){
//        return new ResponseEntity<>("Hello World", HttpStatus.OK);
//    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String get() {
        return "Hello World GET!";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String get1() {
        return "Hello World Post!";
    }

}
