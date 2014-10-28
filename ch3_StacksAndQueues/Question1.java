package chapter3;

public class Question1 {

	int top1;
	int top2;
	int top3;
	
	int tail1;
	int tail2;
	int tail3;
	
	int size;
	int st[];
	public Question1(int size) {
		// TODO Auto-generated constructor stub
		this.size=size;
		st=new int[size];
		
		int temp = size/3;
		
		top1=0;
		tail1=temp-1;
		
		top2=tail1+1;
		tail2=top2+2;
		
		top3=tail2+1;
		tail3=top3+(size-top3-1);
		
	}
	
	
	public void add(String stack, int number){
		
		if(stack.equals("1"))
		{
			if(top1==0){
				st[top1]=number;
			}
			else if (top1<top2){
				top1++;
				st[top1]=number;
				
			}else
				System.out.println("Out of bound for stack 1");
		}
			
		if(stack.equals("2"))
		{
			if(top2>top1 && top2<top3){
				st[top2]=number;
				top2++;
			}
			else
				System.out.println("out of bound for stack 2");
		}
				
		if(stack.equals("3"))
		{
			if(top3>top2 && top3<size){
				st[top3]=number;
				top3++;
			}
			else
				System.out.println("out of bound for stack 3");
		}
		
		
	}
	
	
	public void pop(String stack){
		
		if(stack.equals("1")){
			
			if(top1>0)
				top1--;
		}
		
		if(stack.equals("2")){

			if(top2>top1)
				top2--;
		}
		
		if(stack.equals("3")){

			if(top3>top2)
				top3--;
		}
		
	}
	
	public static void main(String[] args) {
		
		Question1 q1 = new Question1(9);
		
		System.out.println(q1.top1+" "+q1.tail1);
		
		System.out.println(q1.top2+" "+q1.tail2);
		
		System.out.println(q1.top3+" "+q1.tail3);
		
	}
	
	
}
