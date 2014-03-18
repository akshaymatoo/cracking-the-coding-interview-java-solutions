/* 
1.4 Write a method to decide if two strings are anagrams or not
*/
import java.util.*;
public class Prob_1_4
{
	public boolean checkAnagramsUsingSort(String inputString1, String inputString2)
	{
		if (inputString1 == null || inputString2 == null || inputString1.length() != inputString2.length())
		{
			return false;
		}

		//space complexity O(2n) = O(n)
		char[] charArray1 = inputString1.toCharArray();
		char[] charArray2 = inputString1.toCharArray();

		//time complexity O(2nlog(n)) = O(nlog(n))
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		//time complexity O(n) 
		return (new String(charArray1)).equals(new String(charArray2));
		//total time complexity O(n + nlog(n)) = O(nlog(n))
	}

	public boolean checkAnagrams(String inputString1, String inputString2)
	{
		if (inputString1 == null || inputString2 == null || inputString1.length() != inputString2.length())
		{
			return false;
		}

		int[] characters = new int[256];

		for (int i = 0; i < inputString1.length() ; i++)
		{
			characters[inputString1.charAt(i)]++;
		}
		for (int i = 0; i < inputString2.length() ; i++)
		{
			if (characters[inputString2.charAt(i)] <= 0)
				return false;
			characters[inputString2.charAt(i)]--;	
		}
		return true;

	}


	public static void main(String args[])
	{
		Prob_1_4 prob = new Prob_1_4();
		System.out.println(prob.checkAnagrams("abb", "bab"));
		System.out.println(prob.checkAnagrams("A12V", "av12"));
		System.out.println(prob.checkAnagramsUsingSort("A12V", "av12"));
		System.out.println("All tests completed");
	}
}