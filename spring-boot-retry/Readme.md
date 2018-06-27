#springboot retry
Springboot Retry Example (For showing workaround)

Issue: @Retryable is not working with springboot 2.0.2.RELEASE

Findings: If we have called method and retryable method (annotated with @Retryable) in same class. 
Reason: Issue is with built pointcut. The interceptor AnnotationAwareRetryOperationsInterceptor intercepts the called method and not the method annotated.

To verify 
Try Calling following API and check console.

Working @Retryable:
http://localhost:8086/hello/working_retryable

Not Working @Retryable: (even if same method is called)
http://localhost:8086/hello/not_working_retryable