package pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectInvocation implements InvocationHandler {

    private RealSubject subject;

    public SubjectInvocation(RealSubject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before exe");
        method.invoke(subject,args);
        System.out.println("after exe");
        return proxy;
    }
}
