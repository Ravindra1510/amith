package pack2;

public class Factorial1 {

	public static void main(String[] args) {
		System.out.println(fact(4));

	}
	
	static int fact(int n){
		int fact=n;
		if(n<1)
			return 1;
		else
			return fact*fact(n-1);
		}
	}


