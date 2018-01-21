package com.oocl.ir4.dsh.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;


@Aspect
public class SpringAspect {

    @Before("execution(* com.oocl.ir4.dsh.service.SkillGroupService.newSkillGroup(..)))")
    public void before(JoinPoint args) {
        System.out.println("Request Parameter:"+Arrays.toString(args.getArgs()));
    }

    @After("execution(* com.oocl.ir4.dsh.service.SkillGroupService.newSkillGroup(..)))")
    public void after() {
        System.out.println("Response Parameter");
    }

    @AfterReturning(returning = "returns",value = "execution(* com.oocl.ir4.dsh.service.SkillGroupService.newSkillGroup(..)))")
    public void afterReturning(Object returns) {
        System.out.println("Response Result："+returns);
    }

    @AfterThrowing(throwing = "ex",pointcut = "execution(* com.oocl.ir4.dsh.service.SkillGroupService.newSkillGroup(..)))")
    public void afterThrowing(Throwable ex) {
        System.out.println("Throw Exception："+ex.getMessage());
        System.out.println("Exception Stack："+ Arrays.toString(ex.getStackTrace()));
    }

    @Around("execution(* com.oocl.ir4.dsh.service.SkillGroupService.newSkillGroup(..)))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("begin around");
        Object object = point.proceed();
        System.out.println("end around");
        return object;

    }

}
