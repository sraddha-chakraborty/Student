package com.student.data;

import jakarta.servlet.*;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.UUID;

@Component
public class RequestFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        MDC.put("eventId", UUID.randomUUID().toString());
        MDC.put("catSays", "Meowwwww");

        try {
            filterChain.doFilter(servletRequest,servletResponse);
        }
        finally {
            MDC.clear();
        }
    }
}
