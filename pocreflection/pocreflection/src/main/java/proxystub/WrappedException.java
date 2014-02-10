package proxystub;

public class WrappedException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public WrappedException(Throwable cause) {
	super(cause);
    }
}
