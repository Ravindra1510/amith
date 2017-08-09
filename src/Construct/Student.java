package Construct;

public class Student {
	
	
	private int studentid;
	private String studentName;
	private String studentaddress;
	
	Student(int studentid,String studentName,String studentaddress ){
		
		this.studentid=studentid;
		this.studentName=studentName;
		this.studentaddress=studentaddress;
		
	}
	
	int getStudentid(){
		return studentid;
	}

	String getStudentName(){
		return studentName;
		
	}
	
	String getstudentaddress(){
		return studentaddress;
	}
	
	
	void setStudentaddress(String studentaddress){
		this.studentaddress=studentaddress;
	}
}
