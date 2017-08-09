import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int[] a = {2,5,1,6,9};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
System.out.println(Arrays.toString(a));
for (int j = 0; j < a.length; j++) {
	

System.out.print(a[j]+" ");
}
//System.out.println(a[a.length-2]);
	}

}
