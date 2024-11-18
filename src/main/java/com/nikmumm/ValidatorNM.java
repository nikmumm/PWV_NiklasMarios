package com.nikmumm;

import com.cthiebaud.passwordvalidator.PasswordValidator;
import com.cthiebaud.passwordvalidator.ValidationResult;

public class ValidatorNM implements PasswordValidator {
    @Override
    public ValidationResult validate(String password) {
        return new ValidationResult(password.length() >= 8, "Strong PW");
    }

}
