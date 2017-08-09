
public class ReverseString {

	public static void main(String[] args) {
	String str="abcd";
	char[] c=str.toCharArray();
	
//	for(int i=str.length()-1;i>=0;i--){
//		System.out.print(str.charAt(i));
//	}
	
	for(int i=c.length-1;i>=0;i--){
		System.out.print(c[i]);
	}
	
	
	
	

	}

}
