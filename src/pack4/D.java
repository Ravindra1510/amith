package pack4;

public class D {
	public static void main(String[] args) {
		char c=97;
		for (int i = 0; i < 5; i++) {
			for (int s = 5; s >=i; s--) {
				System.out.print(" ");
			}
			for (int j = 0; j <=i; j++) {
				System.out.print(c+++" ");
			}
			System.out.println();
		}
	}

	

}
