/*
2.2 Implement an algorithm to find the nth to last element of a singly linked list
*/


class Node
{
	int data;
	Node link;
}

public class Prob_2_2
{

	public String toString(Node head)
	{
		String output = "";
		Node temp = head;
		while (temp != null)
		{
			output += "[ " + temp.data + "],";
			temp = temp.link;
		}
		return output;
	}


	public Node removeNthFromLast(Node head, int N)
	{
		if (head == null) return null;

		Node temp = head, prev = head;

		while (temp != null && N > 0)
		{
			temp = temp.link;
			N--;
		}

		if (temp == null) return head;

		while (temp != null)
		{
			prev = prev.link;
			temp = temp.link;
		}
		prev.data = prev.link.data;
		prev.link = prev.link.link;
		return head;
	}

	public static void main(String[] args)
	{
		Node nodes[] = new Node[5];
		nodes[0] = new Node();
		nodes[1] = new Node();
		nodes[2] = new Node();

		nodes[0].data = 1;
		nodes[0].link = nodes[1];
		nodes[1].data = 3;
		nodes[1].link = nodes[2];
		nodes[2].data = 2;
		nodes[2].link = null;

		Prob_2_2 prob = new Prob_2_2();
		System.out.println(prob.toString(nodes[0]));

		Node head = prob.removeNthFromLast(nodes[0], 2);
		System.out.println(prob.toString(head));

		System.out.println("All tests completed");

	}



}