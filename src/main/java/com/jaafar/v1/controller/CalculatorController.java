package com.jaafar.v1.controller;

import com.jaafar.v1.model.ResultResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/sum")
    public ResponseEntity<ResultResponse> getSum(@RequestParam String num1, @RequestParam String num2) {

        int result = Integer.parseInt(num1) + Integer.parseInt(num2);
        return ResponseEntity.ok(ResultResponse.builder()
                .result(Integer.toString(result))
                .build()
        );
    }

}