package com.cts.todo.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.cts.todo.model.Todo;

@Component
@Aspect
public class LoggingAspect {

	private static Logger logger = Logger.getLogger("TODO");

	// @Before(value = "execution(* *(..))")
	// public void doLogBeforeMethod(JoinPoint joinPoint) {
	// logger.info("LOG: @Before - " +
	// joinPoint.getSignature().toShortString());
	// }
	//
	// @AfterReturning(pointcut = "execution(* *(..))", returning = "r")
	// public void doLogAfterReturing(JoinPoint joinPoint, Object r) {
	// logger.info("LOG: @AfterReturning - " +
	// joinPoint.getSignature().toShortString());
	// }
	//
	// @AfterThrowing(pointcut = "execution(* *(..))", throwing = "e")
	// public void doLogAfterThrowing(JoinPoint joinPoint, Throwable e) {
	// logger.info("LOG: @AfterThrowing - " +
	// joinPoint.getSignature().toShortString());
	// }
	//
	//
	// @After(value = "execution(* *(..))")
	// public void doLogAfter(JoinPoint joinPoint) {
	// logger.info("LOG: @After - " + joinPoint.getSignature().toShortString());
	// }
	//

	@Around(value = "allMethods() && args(todo)")
	public void doLogAround(ProceedingJoinPoint joinPoint,Todo todo) {
		System.out.println(todo);
		try {
			logger.info("LOG: @Before - " + joinPoint.getSignature().toShortString());
			joinPoint.proceed();
			logger.info("LOG: @AfterReturning - " + joinPoint.getSignature().toShortString());
		} catch (Throwable e) {
			logger.info("LOG: @AfterThrowing - " + joinPoint.getSignature().toShortString());
		} finally {
			logger.info("LOG: @After - " + joinPoint.getSignature().toShortString());
		}

	}
	
	
	// Named Pointcuts
	@Pointcut(value="execution(* *(..))")
	public void allMethods() {}
	
	

}
