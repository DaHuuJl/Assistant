package ru.cchgeu.assistant.astcore.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/hello", produces = {MediaType.APPLICATION_JSON_VALUE})
public class HelloController {

    @GetMapping(path = "/getHello")
    public ResponseEntity<String> getEvents() {
        String str = "hello";
        return ResponseEntity.ok(str);
    }
}
