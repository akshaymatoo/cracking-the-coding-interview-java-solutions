package chapter3;

public class Stack {

	int size;
	int st[];
	int top=-1;
	
	public Stack(int size) {
		this.size=size;
		st = new int[size];
	}
	
	public void add(int element){
			
			if(top<size)
			{
				top++;
				st[top]=element;
			}else
				System.out.println("Size overflow");
			
	}
	
	
	public void pop(){
		
		if(top<0)
			System.out.println("Index out of bound");
		
		top--;
	}
	
	
	public void peek(){
		if(top==-1)
			System.out.println("No elements to peek");
		System.out.println(st[top]);
	}
	
	public static void main(String[] args) {
		
		Stack s = new Stack(5);
		
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		//s.pop();
		
		s.peek();

	}
	
}
