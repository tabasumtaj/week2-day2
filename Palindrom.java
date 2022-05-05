//Build a logic to find the given string is palindrome or not ----madam
package week2.day1;

public class Palindrom {
	public static void main(String[] args)
	{
		String palText1 = "madam";
		int length = palText1.length();
		String revText2 = "";
		for(int i=length-1; i>=0; i--){
			char charText = palText1.charAt(i);
			revText2 = revText2 + charText;
		}
		if(palText1.equals(revText2)){
			System.out.println("it is palindrom ");
		}else{
			System.out.println("it is not palindrom ");
		}

	}
}
