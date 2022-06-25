package classroom;

public class Palindrome {

	public static void main(String[] args) {
		String str="village",reversestr="";
        int strLength=str.length();
	 
		for(int i=(strLength-1);i>=0;--i) {
			reversestr=reversestr+str.charAt(i);
	}
		
		
		if(str.toLowerCase().equals(reversestr.toLowerCase())) {
			System.out.println(str+"It is a palindrome");
		}
			
		
		else {
			System.out.println(str+ "It is not a palindrome");
		}

	}





	}


