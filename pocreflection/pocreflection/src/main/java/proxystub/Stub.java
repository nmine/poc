package proxystub;

import java.io.Serializable;

public interface Stub extends Serializable {
    /**
     * Returns the history object for the stub.
     */
    History getHistory();
}