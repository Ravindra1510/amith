package pack3;

import java.util.Scanner;

public class Progm4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		System.out.println("string 1 length is"+s1.length());
		System.out.println("string 2 length is"+s2.length());
		if(s1.equals(s2)){
			System.out.println("same");
		}else 
				System.out.println("not same");
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("same");
		}
			}
		}


	


