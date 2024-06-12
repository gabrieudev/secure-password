package com.challenge.secure_password.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class PasswordService {

    private List<String> failures;

    public List<String> validate(String password) {
        failures = new ArrayList<>();
        validateLowercase(password);
        validateUppercase(password);
        validateSpecialChar(password);
        validateNumeric(password);
        validateNumberOfChar(password);
        return failures;
    }

    private void validateNumberOfChar(String password) {
        if (password.length() < 8) {
            failures.add("senha deve possuir pelo menos 08 caracteres");
        }
    }

    private void validateUppercase(String password) {
        if (!Pattern.matches(".*[A-Z].*", password)) {
            failures.add("senha deve conter pelo menos uma letra maiúscula");
        }
    }

    private void validateLowercase(String password) {
        if (!Pattern.matches(".*[a-z].*", password)) {
            failures.add("senha deve conter pelo menos uma letra minúscula");
        }
    }

    private void validateNumeric(String password) {
        if (!Pattern.matches(".*[0-9].*", password)) {
            failures.add("senha deve conter pelo menos um dígito numérico");
        }
    }

    private void validateSpecialChar(String password) {
        if (!Pattern.matches(".*[\\W].*", password)) {
            failures.add("senha deve conter pelo menos um caractere especial (e.g, !@#$%)");
        }
    }

}
