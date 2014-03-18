/*
1.2 Write code to reverse a C-Style String (C-String means that “abcd” is represented as five characters, including the null character )
*/

/* 
* Although java has built in functions/ways that do this like new StringBuffer().reverse() or new StringBuilder().reverse() 
* I am assuming a char array and reversing it w/o the above methods 
* Another assumption is the char[] might be longer with unused char and the end of string is denoted by '\u0000' ( the default char value ) */


public class Prob_1_2
{

	public char[] reverse(char[] inputChar)
	{
		// no null checks needed since char[] is a primitive array
		int length = 0, index = 0;
		char temp;

		while (length != inputChar.length && inputChar[length] != '\u0000'){
			length++;
		}
		length--;
		while (index < length)
		{
			temp = inputChar[index];
			inputChar[index] = inputChar[length];
			inputChar[length] = temp;
			index++; length--;
		}
		return inputChar;		
	}

	public static void main(String args[])
	{
		Prob_1_2 prob = new Prob_1_2();
		System.out.println(prob.reverse(new char[10]));

		char[] charArray = new char[10];
		String tempString = "abc";
		for (int i = 0; i < tempString.length(); i ++)
			charArray[i] = tempString.charAt(i);
		System.out.println(prob.reverse(charArray));	
		
		tempString = "";
		charArray = new char[5];
		for (int i = 0; i < tempString.length(); i ++)
			charArray[i] = tempString.charAt(i);
		System.out.println(prob.reverse(charArray));	


		tempString = "abcde";
		charArray = new char[5];
		for (int i = 0; i < tempString.length(); i ++)
			charArray[i] = tempString.charAt(i);
		System.out.println(prob.reverse(charArray));	

		System.out.println("All tests completed");
	}

}