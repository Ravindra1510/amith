import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int originalnum=num;
		int rev=0;
		while(num!=0){
			int rem=num%10;
			rev=rem+rev*10;
			num=num/10;
		}
		System.out.println(rev);
		if(originalnum==rev){
			System.out.println("the given number is palindrome");
		}else
			System.out.println("not palindrome");

	}

}
