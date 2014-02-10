package be.nmine.poc.pocMockito.testlab;

public class StringCalculator {

    public int add(String value) {
	if (value.length() == 0)
	    return 0;
	String[] valueArray = value.split(",");
	return calculateSum(valueArray);
    }

    private int calculateSum(String[] valueArray) {
	int sum = 0;
	for (String value : valueArray) {
	    sum += Integer.parseInt(value);
	}
	return sum;
    }
}
