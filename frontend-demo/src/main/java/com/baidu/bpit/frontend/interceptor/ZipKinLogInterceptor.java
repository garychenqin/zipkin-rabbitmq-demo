package com.baidu.bpit.frontend.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Span;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;

/**
 * Created by chenshouqin on 2016-11-20 21:02.
 */
@Aspect
@Component
public class ZipKinLogInterceptor {

    @Autowired
    private Tracer tracer;

    @Pointcut("execution(public * com.baidu.bpit.frontend.service.impl..*.*(..))")
    public void webLogPointcut() {
    }

    @Around("webLogPointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Span serviceSpan = tracer.createSpan(pjp.getSignature().getName());
        try {
            return pjp.proceed();
        } finally {
            tracer.close(serviceSpan);
        }
    }
}
