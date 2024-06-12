package com.challenge.secure_password.controller;

import com.challenge.secure_password.dto.RequestDTO;
import com.challenge.secure_password.dto.ResponseDTO;
import com.challenge.secure_password.service.PasswordService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping
public class PasswordController {

    @Autowired
    private PasswordService passwordService;

    @PostMapping("/validate-password")
    public ResponseEntity<ResponseDTO> validate(@Valid @RequestBody RequestDTO requestDTO) {
        List<String> failures = passwordService.validate(requestDTO.getPassword());
        if (failures.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseDTO(failures));
    }

}
