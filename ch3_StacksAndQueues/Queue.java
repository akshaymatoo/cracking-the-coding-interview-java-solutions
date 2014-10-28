package chapter3;

public class Queue {

	int size;
	int qu[];
	int head=-1;
	int tail=-1;
	public Queue(int size) {
		// TODO Auto-generated constructor stub
		this.size= size;
		qu= new int[size];
	}
	
	
	public void enqueue(int number){
		
		
		if(head==-1){
			head++;
			tail= head;
			qu[head]=number;
		}
		
		
		
		else if(tail<size){
			tail++;
			qu[tail]=number;
			
		}else{
			System.out.println(tail +"  "+size);
			System.out.println("Out of index");
		}
		
		
	}
	
	public void dequeue(){
		
		if(tail!=-1){
			head++;
			tail--;
		}
	}
		
	public void headPointer(){
		if(head<size)
			System.out.println("Head is "+qu[head]);
		else
			System.out.println("Out of bound");
	}
			
	public static void main(String[] args) {
		Queue qu= new Queue(5);
		
		qu.enqueue(1);
		qu.enqueue(2);
		qu.enqueue(3);
		qu.enqueue(4);
		qu.enqueue(5);
		
		qu.dequeue();
		qu.dequeue();
		qu.dequeue();
		qu.dequeue();
		qu.dequeue();
		qu.headPointer();
	}
}
