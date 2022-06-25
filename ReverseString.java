package classroom;

public class ReverseString {

	public static void main(String[] args) {
		String reverse="feeling good";

		char[] ch=reverse.toCharArray();
		for(int i =reverse.length() - 1;i >=0; i--)
		{
			System.out.println(ch[i]);
		
		}

	}

}
