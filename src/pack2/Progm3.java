package pack2;

public class Progm3 {

	public static void main(String[] args) {
		int count=0;
		for (int i = 0; i <=100 ; i+=5) {
			if(i%2!=0){
				System.out.print(i+" ");
				count++;
			}
			
		}
		System.out.println("....");
		System.out.println("total count is " +count);

	}

}
