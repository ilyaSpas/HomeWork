package com.example.mailsender.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MyConfig {
    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        mailSender.setHost("smtp.yandex.ru");
        mailSender.setPort(465);
        mailSender.setUsername("TestForSpring@yandex.ru");
        mailSender.setPassword("oruovjngqoyhjwhj");
        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtps");
        props.put("mail.debug", "true");

        return mailSender;
    }
}
