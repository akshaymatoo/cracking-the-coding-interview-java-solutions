/*
1.1 Implement an algorithm to determine if a string has all unique characters.
What if you can not use additional data structures?
*/

public class Prob_1_1 {
	
	public boolean isUniqueWithAdditionalBooleanArray(String inputString)
	{
		if (inputString == null) return false;
		//assuming ASCII characters treats a & A differently
		//space complexity - O(n) 
		boolean alphabets[] = new boolean[256];

		for (int i = 0 ; i < inputString.length() ; i++ )
		{
			//time complexity - O(n)
			if (alphabets[(int) inputString.charAt(i)])
				return false;
			alphabets[(int) inputString.charAt(i)]	= true;
		}
		return true;
	}

	public boolean isUniqueUsingBinaryOps(String inputString)
	{
		//assuming only alphabets a-z (all lower cased)
		if (inputString == null) return false;
		//Space Complexity O(1) since since it uses a single integer
		int alphabet = 0;
		inputString = inputString.toLowerCase();
		for (int i = 0; i < inputString.length(); i++)
		{
			if ((alphabet & (1 << (int) ('a' - inputString.charAt(i)) + 1)) > 0)
				return false;
			alphabet |= 1 << (int) inputString.charAt(i);	
		}
		return true;
	}

	public static void main(String args[])
	{
		Prob_1_1 cracking = new Prob_1_1();
		if (false != cracking.isUniqueWithAdditionalBooleanArray(null))
			System.out.println("null check failed isUniqueWithAdditionalBooleanArray");
		if (true == cracking.isUniqueWithAdditionalBooleanArray("abca"))
			System.out.println("unique check failed for abca isUniqueWithAdditionalBooleanArray");
		if (true == cracking.isUniqueWithAdditionalBooleanArray("aA"))
			System.out.println("unique check failed for aA isUniqueWithAdditionalBooleanArray");
		if (true != cracking.isUniqueWithAdditionalBooleanArray(""))
			System.out.println("unique check failed for <empty> isUniqueWithAdditionalBooleanArray");
			
		if (false != cracking.isUniqueUsingBinaryOps(null))
			System.out.println("null check failed isUniqueUsingBinaryOps");
		if (true == cracking.isUniqueUsingBinaryOps("abca"))
			System.out.println("unique check failed for abca isUniqueUsingBinaryOps");
		if (true == cracking.isUniqueUsingBinaryOps("aA"))
			System.out.println("unique check failed for aA isUniqueUsingBinaryOps");
		if (true != cracking.isUniqueUsingBinaryOps(""))
			System.out.println("unique check failed for <empty> isUniqueUsingBinaryOps");
		System.out.println("All Tests Completed");		
	}

}