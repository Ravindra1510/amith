package pack3;

public class DuplicateChar {

	public static void main(String[] args) {
		String str="delll";
		char[] c=str.toLowerCase().toCharArray();
		int count=1;
		for (int i = 0; i < c.length-1; i++) {
			for (int j = i+1; j < c.length; j++) {
				if(c[i]==c[j]){
					c[j]=' ';
					count++;
				
				}
				
			}
			if(c[i]!=' '){
				System.out.println(c[i]+" "+count);
			}
			
		}
	}

}
