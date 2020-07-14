package com.andresglond.backendApp.modules.string_1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "manageString")
public class StringAPI {

    @PostMapping
    public ResponseEntity executeOperation(@RequestBody OperationJSON operationJSON){
        int value=0;
        String response = "";
        ManageString1 exercise2 = new ManageString1();

        do {
            System.out.println("Please select a valid option");
            System.out.println("1. Quantity Characters");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Replace String in Text");
            System.out.println("0. Exit");


        }while(value != 0);

        switch(value) {
            case 1:
                response = exercise2.quantityCharacters(exercise2.getWord1());
                break;
            case 2:
                response = exercise2.convertToUppercase(exercise2.getWord1());
                break;
            case 3:
                response = exercise2.convertToLowercase(exercise2.getWord1());
                break;
            case 4:
                response = exercise2.replaceStringInText(exercise2.getText(), exercise2.getWord1(), exercise2.getWord2());
                break;
            default:
                break;
        }


                 //= exercise2.toString(); // <-- Utilice esta variable para luego mostrar el resultado

        return ResponseEntity.ok(response);
    }
}

