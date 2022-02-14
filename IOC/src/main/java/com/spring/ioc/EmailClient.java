package com.spring.ioc;

public class EmailClient {
    private SpellChecker spellChecker;

    void sendEmail(String emailMessage) {
        spellChecker.checkSpelling(emailMessage);
    }
}
