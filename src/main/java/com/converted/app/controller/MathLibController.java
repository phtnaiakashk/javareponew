package com.converted.app.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.converted.app.service.MathLibService;

@RestController
@RequestMapping("/mathlib")
public class MathLibController {
    private final MathLibService service;

    public MathLibController(MathLibService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity<int> add(@RequestParam int a, @RequestParam int b) {
        // TODO: map request parameters and call service
        int result = service.add(a, b);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/subtract")
    public ResponseEntity<int> subtract(@RequestParam int a, @RequestParam int b) {
        // TODO: map request parameters and call service
        int result = service.subtract(a, b);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/multiply")
    public ResponseEntity<int> multiply(@RequestParam int a, @RequestParam int b) {
        // TODO: map request parameters and call service
        int result = service.multiply(a, b);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/divide")
    public ResponseEntity<double> divide(@RequestParam int a, @RequestParam int b) {
        // TODO: map request parameters and call service
        double result = service.divide(a, b);
        return ResponseEntity.ok(result);
    }

}