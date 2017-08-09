package pack2;

public class progm1 {

	public static void main(String[] args) {
		System.out.println(sum(2,3));
		System.out.println(sum(2.2,3.3));
		System.out.println(sum(2,3,5));

	}
	
	static int sum(int a,int b){
		return a+b;
	}
	
	static double sum(double p,double q){
		return p+q;
	}
	static int sum(int a,int b,int c){
		return a+b+c;
	}

}
