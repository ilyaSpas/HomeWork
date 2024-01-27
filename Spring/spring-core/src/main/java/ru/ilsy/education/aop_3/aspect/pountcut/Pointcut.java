package ru.ilsy.education.aop_3.aspect.pountcut;

public class Pointcut {
    @org.aspectj.lang.annotation.Pointcut("execution( * ru.ilsy.education.aop_3.entity.Dog.make*(..))")
    public void makeDogMethods(){}

    @org.aspectj.lang.annotation.Pointcut("execution( * ru.ilsy.education.aop_3.entity.Dog.get*(..))")
    public void getDogMethods(){}

    @org.aspectj.lang.annotation.Pointcut("execution( * ru.ilsy.education.aop_3.entity.Dog.getOwner())")
    public void humanDogMethod(){}

    @org.aspectj.lang.annotation.Pointcut("execution(* ru.ilsy.education.aop_3.util.MathClass.des(..))")
    public void mathPointcut(){}

    @org.aspectj.lang.annotation.Pointcut("execution(* ru.ilsy.education.aop_3.util.MathClass.sum(..))")
    public void mathSumPointcut(){}

    @org.aspectj.lang.annotation.Pointcut("execution(* ru.ilsy.education.aop_3.util.MathClass.divide(..))")
    public void mathDividePointcut(){}
}
