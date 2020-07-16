package com.andresglond.backendApp.modules.string_2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "manageString")
public class StringAPI {

    @PostMapping(path = "/convertByCharacter")
    public ResponseEntity convertToUpperOrLowerCaseByCharacter(@RequestBody TextDTO textDTO) {

        String response = "";
        ManageString2 exercise3 = new ManageString2();
        response = exercise3.convertToUpperOrLowerCaseByCharacter(textDTO.getText());

        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/limitTextSize")
    public ResponseEntity limitTextSize(@RequestBody TextDTO textDTO) {

        String response = "";
        ManageString2 exercise3 = new ManageString2();
        response = exercise3.limitTextSize(textDTO.getText());

        return ResponseEntity.ok(response);
    }

}