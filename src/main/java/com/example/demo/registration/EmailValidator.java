package com.example.demo.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String s) {
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(s);
        if(matcher.matches()){
            return true;
        }
        return false;
    }
}
