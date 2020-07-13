package com.andresglond.backendApp.modules.calculator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "calculator")
public class CalculatorAPI {

    @PostMapping
    public ResponseEntity executeOperation(@RequestBody OperationDTO operationDTO){

        String response = ""; // <-- Utilice esta variable para luego mostrar el resultado

        return ResponseEntity.ok(response);
    }
}
