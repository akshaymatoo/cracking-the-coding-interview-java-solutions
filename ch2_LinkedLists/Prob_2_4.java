/*
24 You have two numbers represented by a linked list, where each node contains a single digit 
The digits are stored in reverse order, such that the 1’s digit is at the head of the list 
Write a function that adds the two numbers and returns the sum as a linked list
EXAMPLE
Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
Output: 8 -> 0 -> 8
*/

class Node
{
	int data;
	Node link;	
}

public class Prob_2_4
{
	public Node sum(Node number1, Node number2)
	{
		if (number1 == null)	return number1;

		if (number2 == null)	return number2;

		int carry = 0;

		Node sumhead = new Node();
		sumhead.data = number1.data + number2.data + carry;
		if (sumhead.data > 9) 
		{
			carry = 1;
			sumhead.data = 0;
		}
		else
		{
			carry = 0;
		}
		
		Node prev = sumhead;
		number1 = number1.link;
		number2 = number2.link;

		Node temp;

		while (number1 != null && number2 != null)
		{
			temp = new Node();
			temp.data = number1.data + number2.data + carry;
			prev.link = temp;
			prev = temp;
			number1 = number1.link;
			number2 = number2.link;
			if (temp.data > 9) 
			{
				carry = 1;
				temp.data = 0;
			}
			else
			{
				carry = 0;
			}

		}

		while (number1 != null)
		{
			temp = new Node();
			temp.data = number1.data + carry;
			prev.link = temp;
			prev = temp;
			number1 = number1.link;
			if (temp.data > 9) 
			{
				carry = 1;
				temp.data = 0;
			}
			else
			{
				carry = 0;
			}

		}

		while (number2 != null)
		{
			temp = new Node();
			temp.data = number2.data + carry;
			prev.link = temp;
			prev = temp;
			number2 = number2.link;
			if (temp.data > 9) 
			{
				carry = 1;
				temp.data = 0;
			}
			else
			{
				carry = 0;
			}

		}

		if (carry == 1)
		{
			temp = new Node();
			temp.data = 1;
			prev.link = temp;
		}
		return sumhead;
	}

	public String toString(Node head)
	{
		String output = "";
		while (head != null)
		{
			output += head.data + "->";
			head = head.link;
		}
		return output;
	}

	public static void main(String args[])
	{
		Node[] nodes = new Node[8];

		for (int i = 6 ; i >= 0 ; i--)
		{
			nodes[i] = new Node();
			nodes[i].data = i;
			nodes[i].link = nodes[i+1];
		}

		nodes[3].link = null;
		nodes[6].link = null;

		Prob_2_4 prob = new Prob_2_4();

		System.out.println(prob.toString(nodes[0]));
		System.out.println(prob.toString(nodes[4]));

		Node head = prob.sum(nodes[0], nodes[4]);

		System.out.println(prob.toString(head));

		System.out.println("All tests completed");

	}
}