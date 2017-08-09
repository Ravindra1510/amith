package Patterns;

public class Pattern6 {

	public static void main(String[] args) {
		int size=5;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				

				
//				x
//				if(i==j||i+j==4 )
				//v
				if((i==j && i<=2)||(i+j==4 && i<=2))
				
				
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
