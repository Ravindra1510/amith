package pack4;

public class Q2 {

	public static void main(String[] args) {
		String s="This;Is;Interview";
		char[] c=s.toCharArray();
		for(char v:c){
			if(v==';'){
				System.out.println();
			}else{
				System.out.print(v+"");
			}
				
		}

	}

}
