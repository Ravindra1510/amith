package Construct;

public class CreateStudent {

	public static void main(String[] args) {
		Student s1=new Student(11, "arun", "chandralayout");
		Student s2=new Student(12,"Karthik","Rajajinagar");
		System.out.println(s1.getStudentName());
		System.out.println(s1.getstudentaddress());
		s1.setStudentaddress("ambedkar clg");
		System.out.println(s1.getstudentaddress());
		System.out.println(s1.getStudentid());
		
	}

}
