package ru.ilsy.education.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.ilsy.education.aop")
@EnableAspectJAutoProxy
public class Config {
}
