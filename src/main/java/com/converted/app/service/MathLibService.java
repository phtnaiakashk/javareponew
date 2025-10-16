package com.converted.app.service;

import org.springframework.stereotype.Service;

@Service
public class MathLibService {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

}