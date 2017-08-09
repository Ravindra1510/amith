package pack4;

public class Q {

	public static void main(String[] args) {
		String str="abcdab";
		char[] c=str.toCharArray();
		for (int i = 0; i < c.length-1; i++) {
			for (int j = i+1; j < c.length; j++) {
				while(c[i]==c[j]){
					System.out.println(c[j]);
					break;
					
				}
				
			}
		}

	}

}
