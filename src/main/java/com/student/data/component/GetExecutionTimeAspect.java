package com.student.data.component;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Aspect
@Component
public class GetExecutionTimeAspect {
    private static final Logger log = LoggerFactory.getLogger(GetExecutionTimeAspect.class);

    @Around("@annotation(com.student.data.annotation.GetExecutionTime)")
    public Object getExecutiomTime(ProceedingJoinPoint joinPoint) throws Throwable {
        String eventId = UUID.randomUUID().toString();
        MDC.put("eventId", eventId);
        MDC.put("catSays", "Meowwwww");

        try {
            long startTime = System.currentTimeMillis();
            Object result = joinPoint.proceed();
            long endTime = System.currentTimeMillis();

            long executionTime = endTime - startTime;

            log.info("-------------------------------------");
            log.info("{} method execution time: {}", joinPoint.getSignature().getName(), executionTime);
            log.info("-------------------------------------");

            return result;
        }
        finally {
            MDC.clear();
        }
    }
}
