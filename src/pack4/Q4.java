package pack4;

public class Q4 {

	public static void main(String[] args) {
		
		String str="welcome to tyss";
		String[] words = str.split(" ");
        
        String reverse = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverse = reverse + reverseWord + " ";
        }
        System.out.println(reverse);

	}

}
