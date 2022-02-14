package com.dependency.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailClient {
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    @Autowired
    public void setSpellChecker(SpellChecker advancedSpellChecker) {
        this.spellChecker = advancedSpellChecker;
    }

    void sendEmail(String emailMessage){
        spellChecker.checkSpelling(emailMessage);
    }

}
