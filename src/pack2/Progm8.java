package pack2;


 class Student{
	int id=112;
	String name="Arun";
	
	static int id2=113;
	static String name2="Karthik";
	
	
	
}

public  class Progm8 {

	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		System.out.println(Student.id2);
		System.out.println(Student.name2);

	}

}
