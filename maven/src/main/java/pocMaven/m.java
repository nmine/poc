package pocMaven;

public class m {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("magic");
		builder.append("al").replace(1, 3, "us");
		boolean b = builder.toString().matches("musical");
		System.out.println(b);
		String c = "ee";
		String d = "ee";
		System.out.println(d.equalsIgnoreCase(c));
		
		
	}
}
