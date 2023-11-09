package io.amplicode.amplicodehero.mvcclasses;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MyAnnotationValidator implements ConstraintValidator<MyAnnotation, String> {
    @Override
    public void initialize(MyAnnotation constraintAnnotation) {
        // TODO do initialization
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // TODO write validation logic
        return false;
    }
}