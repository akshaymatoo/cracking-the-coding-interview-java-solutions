/*

2.3 Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node
EXAMPLE
Input: the node ‘c’ from the linked list a->b->c->d->e
Result: nothing is returned, but the new linked list looks like a->b->d->e
*/

class Node
{
	public Node() {}

	char data;
	Node link;
}

public class Prob_2_3
{
	public boolean removeMiddle(Node mid)
	{
		if ( mid == null || mid.link == null )
		{
			return false;
		}
		mid.data = mid.link.data;
		mid.link = mid.link.link;
		return true;
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


	public static void main(String[] args)
	{
		Node[] nodes = new Node[5];

		for (int i = 0 ; i < 5 ; i++ )
		{
			nodes[i] = new Node();
		}

		nodes[0].data = 'a';
		nodes[0].link = nodes[1];
		nodes[1].data = 'b';
		nodes[1].link = nodes[2];
		nodes[2].data = 'c';
		nodes[2].link = nodes[3];
		nodes[3].data = 'd';
		nodes[3].link = nodes[4];
		nodes[4].data = 'e';
		nodes[4].link = null;

		Prob_2_3 prob = new Prob_2_3();

		System.out.println(prob.toString(nodes[0]));

		prob.removeMiddle(nodes[2]);

		System.out.println(prob.toString(nodes[0]));

		System.out.println("All tests completed");
	}
	
}