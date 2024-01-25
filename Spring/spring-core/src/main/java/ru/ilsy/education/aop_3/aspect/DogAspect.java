package ru.ilsy.education.aop_3.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import ru.ilsy.education.aop_3.entity.Dog;
import ru.ilsy.education.aop_3.entity.Human;

@Aspect
public class DogAspect {
//    @Before("ru.ilsy.education.aop_3.aspect.pountcut.Pointcut.makeDogMethods()")
//    public void beforeMakeSoundLogging(){
//        System.out.println("Dog want to make sound.");
//    }
//
//    @After("ru.ilsy.education.aop_3.aspect.pountcut.Pointcut.makeDogMethods()")
//    public void afterMakeSoundLogging(){
//        System.out.println("Dog made sound.");
//    }
//
//    @AfterReturning(pointcut = "ru.ilsy.education.aop_3.aspect.pountcut.Pointcut.getDogMethods()")
//    public void afterReturningDateFromDogsClassLogging(JoinPoint joinPoint){
//        Dog someDog = (Dog) joinPoint.getTarget();
//        System.out.println("Кто-то получил информцию о собаке " + someDog.getName());
//    }

    @AfterReturning(pointcut = "ru.ilsy.education.aop_3.aspect.pountcut.Pointcut.humanDogMethod()", returning = "owner")
    public void setOwnerLogging(Human owner){
        Human human = owner;
        human.setName("New owner!");
    }

}
