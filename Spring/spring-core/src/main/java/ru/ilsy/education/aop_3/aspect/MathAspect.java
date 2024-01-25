package ru.ilsy.education.aop_3.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MathAspect {
    @AfterThrowing(pointcut = "ru.ilsy.education.aop_3.aspect.pountcut.Pointcut.mathPointcut()",
            throwing = "exception")
    public void loggingMathAspect(Throwable exception) {
        System.out.println("Исключение " + exception.getMessage());
    }
}
