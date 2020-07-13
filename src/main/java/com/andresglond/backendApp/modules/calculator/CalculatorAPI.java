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

        Calculator calculator = new Calculator(operationDTO.getNumber1(), operationDTO.getNumber2(), operationDTO.getOperation());
        calculator.operationValidate();


        String response = calculator.toString(); // <-- Utilice esta variable para luego mostrar el resultado

        return ResponseEntity.ok(response);
    }
}
