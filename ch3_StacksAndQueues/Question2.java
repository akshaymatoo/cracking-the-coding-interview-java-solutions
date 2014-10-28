package chapter3;

import java.util.Stack;

public class Question2 {

	
	public static void main(String[] args) {
		
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.add(1);st.add(2);st.add(3);st.add(4);st.add(5);st.add(6);
		
		
		System.out.println(st);
		
		
		Stack<Integer> sec = new Stack<Integer>();
		
		while(!st.isEmpty()) {
			
			if(sec.isEmpty())
				sec.add(st.pop());
			else
			{
				int top = sec.peek();
				int t = st.peek();
				if(top < t)
				{
					int temp = sec.pop();
					sec.add(st.pop());
					sec.add(temp);
				}else
					sec.add(st.pop());
			}
		}
		
		
		System.out.println(sec.peek());
		
		
		
		
	}
}
