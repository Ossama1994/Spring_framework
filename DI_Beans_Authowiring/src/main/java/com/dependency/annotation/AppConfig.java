package com.dependency.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "com.dependency.annotation")
   public class AppConfig {

   /* @Bean(name ="basicSpellChecker")
    public BasicSpellChecker createBasicSpellChecker(){
        return new BasicSpellChecker();
    }

    @Bean(name = "advancedSpellChecker")
      public AdvancedSpellChecker createAdvancedSpellChecker() {
        return new AdvancedSpellChecker();
    }

    @Bean(name = "emailClient")
     public EmailClient createEmailClient() {
        EmailClient emailClient = new EmailClient();
        emailClient.setSpellChecker(createAdvancedSpellChecker());
        return emailClient;

    */
     }

