package ru.ilsy.education.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {
    //@Before("execution(public void ru.ilsy.education.aop.Dog.makeSound())")
//    @Before("execution(public void makeSound())")
//    public void makeSoundAdvice(){
//        System.out.println("makeSoundAdvice: кто-то издает звук");
//    }
//
//    @Before("execution(public void makeSound())")
//    public void makeMoveAdvice(){
//        System.out.println("makeMoveAdvice: кто-то куда-то идет");
//    }

//    @Before("execution(* make*())")
//    public void makeMoveAdvice(){
//        System.out.println("someAdvice: кто-то что-то делает");
//    }

    @Pointcut("execution(* greetPet(Animal))")
    private void petGreetPointcut(){}
    @Pointcut("execution(* feedPet(Animal))")
    private void petFeedPointcut(){}

    @Pointcut("petGreetPointcut() || petFeedPointcut()")
    public void doubleAdvice(){
    }

//    //@Before("petGreetPointcut()")
//    @Before("doubleAdvice()")
//    public void loggingAdvice(){
//        System.out.println("greetingAdvice: Human want to greet a Pet");
//    }
//
//    //@Before("petFeedPointcut()")
//    @Before("doubleAdvice()")
//    public void securityAdvice(){
//        System.out.println("feedAdvice: Human want to feed a Pet");
//    }

//    @Before("doubleAdvice()")
//    public void accessAdvice(){
//        System.out.println("some one want to get animal");
//    }

    @Pointcut("execution(public * ru.ilsy.education.aop.Human.*(..))")
    private void allPublicHumanMethods(){}

    @Pointcut("execution(public * ru.ilsy.education.aop.Human.feedPet(..))")
    private void feedMethod(){}

    @Pointcut("allPublicHumanMethods() && !feedMethod()")
    private void allHumanMethodsExceptFeeding(){}

//    @Before("allPublicHumanMethods()")
//    public void infoHumanAdvice(){
//        System.out.println("infoHumanAdvice: Человек что-то делает");
//    }

    @Before("allHumanMethodsExceptFeeding()")
    public void infoHumanAdvice(){
        System.out.println("infoHumanAdvice: Человек что-то делает, но кормление не отслеживается");
    }


}
