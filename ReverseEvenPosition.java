//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
package week2.day1;

public class ReverseEvenPosition {
	public static void main(String args[])
	{
		String test = "I am a software tester"; 
		String [] splitText = test.split(",");
		int length = test.length();
		String revText2="";
		String revText3 ="";
		for(int i = test.length()-1;i >=0;i--)
		{

			char charText = test.charAt(i);
			//revText2  =  charText + revText2;
			revText2 =   revText2 + charText;
			
		}
		System.out.println(revText2);
	}
}


