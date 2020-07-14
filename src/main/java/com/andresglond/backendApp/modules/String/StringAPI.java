package com.andresglond.backendApp.modules.String;

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

        ManageString2 exercise3 = new ManageString2(operationJSON.getResult());



        String response = exercise3.toString(); // <-- Utilice esta variable para luego mostrar el resultado

        return ResponseEntity.ok(response);
    }
}