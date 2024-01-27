package ru.ilsy.education.aop_3.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MathAspect {
    @AfterThrowing(pointcut = "ru.ilsy.education.aop_3.aspect.pountcut.Pointcut.mathPointcut()",
            throwing = "exception")
    public void loggingMathAspect(Throwable exception) {
        System.out.println("Исключение " + exception.getMessage());
    }

    @Around("ru.ilsy.education.aop_3.aspect.pountcut.Pointcut.mathSumPointcut()")
    public Object loggingMathSumAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // в сигнатуре метода указываем, какой объект мы возвращает,
        // он должен быть анатогичный target,
        // можем использовать Object
        System.out.println("Начало работы advice");
        // из proceedingJoinPoint получаем результат выполнения метода
        int targetMethodResult = (int) proceedingJoinPoint.proceed();
        // а так же можем проводить с ним какие - либо действия
        targetMethodResult++;
        System.out.println("Конец работы advice");
        // далее его же возвращаем
        return targetMethodResult;
    }

    @Around("ru.ilsy.education.aop_3.aspect.pountcut.Pointcut.mathDividePointcut()")
    public Object loggingMathDivideAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object targetMethodResult = 0;
        try {
            targetMethodResult = (int) proceedingJoinPoint.proceed();
        } catch (ArithmeticException e) {
            System.out.println("Произошло арифметическое исключение");
        }

        return targetMethodResult;
    }
}
