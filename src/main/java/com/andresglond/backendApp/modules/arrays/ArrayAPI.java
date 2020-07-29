package com.andresglond.backendApp.modules.arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



import java.util.ArrayList;
@RestController
@RequestMapping(path = "manageArrays")
public class ArrayAPI {


    @PostMapping(path = "/getHelloWorld")
    public ResponseEntity getHelloWorld() {

        char[] response = new char[11];
        Array exercise5 = new Array();
        response = exercise5.getHelloWorld();

        return ResponseEntity.ok(response);
    }
    @PostMapping(path = "/getArrayFromString")
    public ResponseEntity getArrayFromString(@RequestBody StringDTO stringDTO) {

        char[] response = new char[100];
        Array exercise5 = new Array();
        response = exercise5.getArrayFromString(stringDTO.getText());

        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/getArrayOfStrings")
    public ResponseEntity getArrayOfStrings(@RequestBody StringDTO stringDTO) {

        ArrayList<String> response = new ArrayList<String>();
        Array exercise5 = new Array();
        response = exercise5.getArrayOfStrings(stringDTO.getText());

        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/getSumOfIntegers")
    public ResponseEntity getSumOfIntegers(@RequestBody IntegerDTO integerDTO) {

        ArrayListDTO response = new ArrayListDTO();
        Array exercise5 = new Array();
        response = exercise5.getSumOfIntegers(integerDTO.getValue());

        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/getDataBoolean")
    public ResponseEntity getDataBoolean(@RequestBody BooleanDTO booleanDTO) {

        BooleanArrayListDTO response = new BooleanArrayListDTO();
        Array exercise5 = new Array();
        response = exercise5.getDataBoolean(booleanDTO.isValue());

        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/getStringUnited")
    public ResponseEntity getStringUnited(@RequestBody StringArrayDTO stringArrayDTO) {

        String response = new String();
        Array exercise5 = new Array();
        response = exercise5.getStringUnited(stringArrayDTO.getStrings());

        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/getResultado")
    public ResponseEntity getResultado(@RequestBody IntegerArrayDTO integerArrayDTO) {

        int response = 0;
        Array exercise5 = new Array();
        response = exercise5.getResultado(integerArrayDTO.getIntegers());

        return ResponseEntity.ok(response);
    }

}
