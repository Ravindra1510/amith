package pack2;

public class Fibonacci {

	public static void main(String[] args) {
		int first=0,second=1;
		System.out.print(+first+" "+second);
		for (int i = 0; i<8; i++) {
			int res=first+second;
			System.out.print(" "+res+" ");
			first=second;
			second=res;
		}

	}

}
