package ru.ilsy.education.aop_2.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import ru.ilsy.education.aop_2.entity.Dog;

import java.util.Arrays;

@Aspect
public class DogAspect {
    @Before("ru.ilsy.education.aop_2.aspect.pointcut.DogPointcut.allDogsMethods()")
    public void dogAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        //общая информация о методе
        System.out.println("methodSignature: " + methodSignature);
        System.out.println("methodSignature.getMethod(): " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType(): " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName(): " + methodSignature.getName());
        //Получаем аргументы из joinPoint
        System.out.println("joinPoint.getArgs(): " + Arrays.toString(joinPoint.getArgs()));

        Dog dog = (Dog) joinPoint.getTarget();

//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        if(methodSignature.getName().equals("setName")){
            Object[] objects = joinPoint.getArgs();
            String name = (String) objects[0];
            System.out.println(dog.getName() + " был переименнован в - " +  name);
        }

    }
}
