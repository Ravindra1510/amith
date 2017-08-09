import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		int even=0;
		int odd=0;
		while(num!=0){
			int rem=num%10;
			if(rem%2==0){
				even=even+rem;
			}
			else{
				odd=odd+rem;
			}
			num=num/10;
		}
		System.out.println("sum of even number is"+even);
		System.out.println("sum of odd number is"+odd);

	}

}
