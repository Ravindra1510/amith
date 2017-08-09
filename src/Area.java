import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the radius");
		int r=s.nextInt();
		double res=area(r);
		System.out.println("area of a circle is "+res);

	}
	
	static double  area(int r){
		 return 3.14*r*r;
	}

}
