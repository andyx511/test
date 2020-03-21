package AOP.jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * projectName：test
 * name：DynamicAgent
 * description：todo
 * date：2020/3/21 11:37 上午
 * auther：nidingbo
 */
public class DynamicAgent {
    // 实现InvocationHandler接口，初始化被代理类的对象
    public static class MyHandler implements InvocationHandler{

        private Object proxy;

        public MyHandler(Object proxy){
            this.proxy = proxy;
        }

        // 自定义invoke方法
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            System.out.println("before invoke ");

            Object ret = method.invoke(this.proxy,args);

            System.out.println("after invoke ");

            return ret;
        }

        public static Object agent(Class interfaceClazz, Object proxy){
            return Proxy.newProxyInstance(interfaceClazz.getClassLoader(),
                    new Class[]{interfaceClazz},new MyHandler(proxy));
        }
    }
}
