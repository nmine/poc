package be.nmine.pocja.utils;

public interface Constants {

    public enum Sex {
	WOMEN(1), MAN(2);

	private int code;

	private Sex(int code) {
	    this.code = code;
	}

	public int getCode() {
	    return code;
	}

	public static Sex fromCode(int code) {
	    for (Sex sex : values()) {
		if (sex.code == code) {
		    return sex;
		}
	    }
	    throw new IllegalArgumentException();
	}
    }

}
