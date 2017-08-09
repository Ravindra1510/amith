
public class CheckPrime {

	public static void main(String[] args) {
		int n=6;
		String str="prime";
		for(int i=2;i<n;i++){
			if(n%i==0){
				str="not prime";
			}
			
		}
System.out.println(str);
	}

}
