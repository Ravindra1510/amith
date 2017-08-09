package Patterns;

public class Pattern12 {

	public static void main(String[] args) {
		//g
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						if(i==0 || j==0 || i==2 || (j==4 && j<=2 ) || (i==j && i>=2))
						System.out.print("* ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}

	}

}
