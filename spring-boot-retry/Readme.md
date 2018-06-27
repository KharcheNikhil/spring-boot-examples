#springboot retry
Springboot Retry Example (For showing workaround)

Observed issue that if we have called method and retryable method (annoted with @Retryable) in same class. The interceptor AnnotationAwareRetryOperationsInterceptor intercepts the called method and not the method annoted.

For Checking this, 
Try Calling following API and check console.

Working @Retryable:
http://localhost:8086/hello/working_retryable

Not Working @Retryable: (even if same method is called)

