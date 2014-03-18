/*
1.8 Assume you have a method isSubstring which checks if one word is a substring of another Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring (i e , “waterbottle” is a rotation of “erbottlewat”)
*/

public class Prob_1_8
{
	public boolean isSubstring(String matchString, String rotatedString)
	{
		if ( matchString == null || rotatedString == null ) return false;

		return ( (rotatedString + rotatedString).contains(matchString) );
	}

	public static void main(String args[])
	{
		Prob_1_8 prob = new Prob_1_8();
		System.out.println(prob.isSubstring("waterbottle", "erbottlewat"));
		System.out.println(prob.isSubstring("waterbottle", "erbottlwat"));
		System.out.println(prob.isSubstring("waterbottle", "waterbottle"));
	}
}
