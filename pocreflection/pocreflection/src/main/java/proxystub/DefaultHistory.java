package proxystub;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DefaultHistory implements History {
    private static final long serialVersionUID = 1L;

    @Override
    public long recordMethodCall(Proxy p, Method m, Object[] args) {
	return 0;
    }

    @Override
    public void recordReturnValue(long callID, Object returnValue) {
    }

    @Override
    public void recordException(long callID, Throwable cause) {
    }
}
