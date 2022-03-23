package pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        RealSubject o = (RealSubject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces(), new SubjectInvocation(new RealSubject()));
        o.run();
    }
}
