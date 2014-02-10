package be.nmine.pocreflection.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProxyFactory implements InvocationHandler {
	
	Logger LOG = LoggerFactory.getLogger(this.getClass().getName());
	public static Object createProxy(Object obj) {
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
				.getClass().getInterfaces(), new ProxyFactory(obj));
	}

	private Object target;

	private ProxyFactory(Object obj) {
		target = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		try {
			LOG.info(method.getName() + "(...) called");
			result = method.invoke(target, args);
		} catch (InvocationTargetException e) {
			LOG.info(method.getName() + " throws " + e.getCause());
			throw e.getCause();
		}
		LOG.info(method.getName() + " returns");
		String resultByProxy = (String)result+" -- add by proxy --";
		LOG.info(resultByProxy);
		return (String)result+" -- add by proxy --";
	}
}