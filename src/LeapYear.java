
public class LeapYear {

	public static void main(String[] args) {
		int year=2004;
		if((year%400==0) || ((year%4==0 && (year!=100)))){
			System.out.println("leap yr");
		}else{
			System.out.println("not a leap yr");
		}
	}

}

