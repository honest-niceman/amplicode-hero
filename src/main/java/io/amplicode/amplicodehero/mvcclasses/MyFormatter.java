package io.amplicode.amplicodehero.mvcclasses;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class MyFormatter implements Formatter<Object> {

    @Override
    public Object parse(String text, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(Object object, Locale locale) {
        return null;
    }
}