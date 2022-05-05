//print the string number of times 'e' from the string 'testleaf'

package week2.day1;

public class StringtoNumber {
	public static void main(String[] args)
	{
		String text1 = "testleaf";
		char[] array =  text1.toCharArray();
		char charAt;
		int  length = 0;
		for(int i = 0; i < array.length; i++)
		{
			 charAt = text1.charAt(i);
			// System.out.println("length--"+charAt);
					if(charAt == 'e'){
						length =length +1;
					}
		}
		System.out.println("length--"+length);

	}

}
