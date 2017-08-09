package Patterns;

public class Pattern14 {

	public static void main(String[] args) {
	

		//Tripod
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
				if(i==0||i==2||(j==0 && i<=2) || (j==4 && i<=2)||(j==2 && i>=2)||(i==j && i>=2)||(i+j==4 && i>=2))
						System.out.print("* ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}

	}

}
