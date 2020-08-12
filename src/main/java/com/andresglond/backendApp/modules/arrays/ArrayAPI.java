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


Array arreglo = new Array();
Array suma = new Array();
Array booleanos = new Array();

    @PostMapping(path = "/getHelloWorld")
    public ResponseEntity getHelloWorld() {

        CharArrayDTO response = new CharArrayDTO();
        Array exercise5 = new Array();
        response = exercise5.getHelloWorld();

        return ResponseEntity.ok(response);
    }
    @PostMapping(path = "/getArrayFromString")
    public ResponseEntity getArrayFromString(@RequestBody StringDTO stringDTO) {

        CharArrayDTO response = new CharArrayDTO();
        Array exercise5 = new Array();
        response = exercise5.getArrayFromString(stringDTO.getText());

        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/getArrayOfStrings")
    public ResponseEntity getArrayOfStrings(@RequestBody StringDTO stringDTO) {

        ArrayList<String> response = new ArrayList<String>();


        response = arreglo.getArrayOfStrings(stringDTO.getText());

        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/getSumOfIntegers")
    public ResponseEntity getSumOfIntegers(@RequestBody IntegerDTO integerDTO) {

        ArrayListDTO response = new ArrayListDTO();
        response = suma.getSumOfIntegers(integerDTO.getValue());

        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/getDataBoolean")
    public ResponseEntity getDataBoolean(@RequestBody BooleanDTO booleanDTO) {

        BooleanArrayListDTO response = new BooleanArrayListDTO();

        response = booleanos.getDataBoolean(booleanDTO.isValue());

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
