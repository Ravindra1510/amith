package pack4;

public class Pattern {

	public static void main(String[] args) {
		String str="welcome to test yantra";
		StringBuilder sb = new StringBuilder(str);
		sb.insert(9, "@");
		sb.insert(13, "@");
		sb.insert(17, "@");
		sb.insert(23, "@");
		System.out.println(sb);
		
		sb.reverse();

	}

}
