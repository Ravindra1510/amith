
public class SwapNum {

	public static void main(String[] args) {
	int n1=2;
	int n2=3;
//	int temp;
//	temp=n1;
//	n1=n2;
//	n2=temp;
	
	n1=n1+n2;
	n2=n1-n2;
	n1=n1-n2;
	System.out.println("after swap "+n1+" " +n2);

	}

}
