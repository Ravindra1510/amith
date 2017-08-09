package pack3;

public class Pattern {

	public static void main(String[] args) {
//	for (int i = 1; i <= 5; i++) {
//		for (int j = 1; j <=5; j++) {
//			if(i+j==6){
//			System.out.print("*");
//		}else{
//			System.out.print(" ");
//		}
//		
//	}
//		
//System.out.println();
//	}
		
		
		
//		for (int i = 1; i <=5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				if(i==j || i+j==6){
//					System.out.print(j);
//				}else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		
//		for (int i = 1; i <=5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				if(i==1 || i==5 || i+j==6){
//					System.out.print("*");
//				}else
//					System.out.print(" ");
//			}
//			System.out.println();
//}
		
		String str1="abc123xyz";
		int sum=0;
		char[] c=str1.toCharArray();
		for(char v:c){
			if(Character.isDigit(v)){
				int d=Character.getNumericValue(v);
				sum=sum+d;
			}
			
		}
		System.out.println(sum);
	}
	}
