package com.andresglond.backendApp.modules.string_1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "manageString")
public class StringAPI {

    @PostMapping(path = "/quantityCharacters")
    public ResponseEntity getQuantityCharacters(@RequestBody TextDTO textDTO){

        String response = "";
        ManageString1 exercise2 = new ManageString1();
        response = exercise2.quantityCharacters(textDTO.getText());

        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/convertToUppercase")
    public ResponseEntity convertToUppercase(@RequestBody TextDTO textDTO){

        String response = "";
        ManageString1 exercise2 = new ManageString1();
        response = exercise2.convertToUppercase(textDTO.getText());

        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/convertToLowercase")
    public ResponseEntity convertToLowercase(@RequestBody TextDTO textDTO){

        String response = "";
        ManageString1 exercise2 = new ManageString1();
        response = exercise2.convertToLowercase(textDTO.getText());


        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/replaceStringInText")
    public ResponseEntity replaceStringInText(@RequestBody ReplaceTextDTO replaceTextDTO){

        String response = "";
        ManageString1 exercise2 = new ManageString1();
        response = exercise2.replaceStringInText(replaceTextDTO.getText(),replaceTextDTO.getWord1(), replaceTextDTO.getWord2());


        return ResponseEntity.ok(response);
    }
}

