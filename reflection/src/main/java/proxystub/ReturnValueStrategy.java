package proxystub;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public interface ReturnValueStrategy {
    /**
     * Note that getReturnValue is expected to produce the return values for calls to Object.equals, Object.toString, and Object.hashCode.
     */
    Object getReturnValue(Proxy p, Method m, Object[] args, History h) throws WrappedException;
}
