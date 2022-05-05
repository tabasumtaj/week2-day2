// Check number of occurrences of a char (eg 'e') in a String
package week2.day1;

public class CharOccurance {
	public static void main(String[] args)
	{
		String str = "welcome to chennai";
		int count = 0;
		char Charval ;
		char [] array = str.toCharArray();
		int length = array.length;
		for(int i = 0; i <length;i++)
		{
			Charval = str.charAt(i);
			if(Charval == 'e')
			{
				count = count +1;
			}
		}
		System.out.println(count);

	}

}
