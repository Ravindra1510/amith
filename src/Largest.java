import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
//		if(a>b && a>c){
//			System.out.println(+a+" is larger");
//		}else if(b>c){
//			System.out.println(+b+" is larger");
//		}else
//			System.out.println(+c+" is larger");
	int big=a>b ? (a>c ? a : c) : (b>c ? b : c);
		System.out.println(big);
	}

}
