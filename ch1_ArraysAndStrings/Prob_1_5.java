/*
1.5 Write a method to replace all spaces in a string with ‘%20’


Java has built in replace functionality
use String > .replace(replaceWhat, replaceWith)
*/

public class StringReplace {

	public static void main(String[] args) {
		String str="Hi  i  am  a  boy";
		
		
		StringBuilder sb =  new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			int character = (int)str.charAt(i); 
			if(character == 32)
				sb.append("%20");
			else
				sb.append(str.charAt(i));
			
		}
		System.out.println(sb.toString());
		
	}
