package com.converted.app.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.converted.app.service.MainService;

@RestController
@RequestMapping("/main")
public class MainController {
    private final MainService service;

    public MainController(MainService service) {
        this.service = service;
    }

    @GetMapping("/main")
    public ResponseEntity<int> main() {
        // TODO: map request parameters and call service
        int result = service.main();
        return ResponseEntity.ok(result);
    }

}