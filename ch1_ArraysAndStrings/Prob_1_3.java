/*
1.3 Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer 
NOTE: One or two additional variables are fine An extra copy of the array is not
FOLLOW UP
Write the test cases for this method
*/

public class Prob_1_3
{
	public String removeDuplicatesUsingBinaryArray(String inputString)
	{
		if ( inputString == null ) return null;

		//assuming that it contains only a-z characters

		char[] charArray = new char[inputString.length()];

		boolean[] alphabets = new boolean[256];
		int count = 0;
		
		for (int i = 0 ; i < inputString.length() ; i++ )
		{
			char c = inputString.charAt(i);
			int index = (int) c;
			if (!alphabets[index])
			{
				alphabets[index] = true;
				charArray[count++] = c;
			}
		}
		return new String(charArray);
	}

	public String removeDuplicates(String inputString)
	{
		if ( inputString == null ) return null;

		//assuming that it contains only a-z characters

		char[] charArray = new char[inputString.length()];

		int count = 0;
		boolean present = false;
		for (int i = 0 ; i < inputString.length() ; i++ )
		{
			present = false;
			char c = inputString.charAt(i);
			for (int j = 0 ; j < count ; j++)
			{
				if (charArray[j] == c)
				{
					present = true;
				}
			}
			if (!present)
			{
				charArray[count++] = c;
			}
		}
		return new String(charArray);
	}

	public static void main(String args[])
	{
		Prob_1_3 prob = new Prob_1_3();
		System.out.println(prob.removeDuplicates("abc"));
		System.out.println(prob.removeDuplicates(null));
		System.out.println(prob.removeDuplicates("aA"));
		System.out.println(prob.removeDuplicates("AA"));		
	}
}