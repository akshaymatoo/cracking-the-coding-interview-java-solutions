/*

2.5 Given a circular linked list, implement an algorithm which returns node at the beginning of the loop
DEFINITION
Circular linked list: A (corrupt) linked list in which a node’s next pointer points to an earlier node, so as to make a loop in the linked list
EXAMPLE
input: A -> B -> C -> D -> E -> C [the same C as earlier]
output: C
*/

import java.util.*;

class Node
{
	int data;
	Node link;

	@Override
	public String toString()
	{
		return String.valueOf(data);
	}

}

public class Prob_2_5
{
	//time complexity  O(n)
	//space complexity O(n)
	public Node findLoopStartUsingSet(Node head)
	{
		//this detects loop using value, this can also be replace with Node
		Set<Integer> dataSet = new HashSet<Integer>();

		while (head != null)
		{
			if (dataSet.contains(head.data))
			{
				return head;
			}
			dataSet.add(head.data);
			head = head.link;
		}
		return null;

	}

	//time complexity O(n)
	//space complexity O(1)
	public Node findLoopStart(Node head)
	{
		if (head == null) return null;

		Node slowRunner = head, fastRunner = head;

		while (fastRunner.link != null)
		{
			slowRunner = slowRunner.link;
			fastRunner = fastRunner.link.link; 
		}

		if (fastRunner.link == null)	return null;

		//loop exists
		//refer to the literature for explanation
		Node newRunner = head;
		while (newRunner != slowRunner)
		{
			newRunner = newRunner.link;
			slowRunner = slowRunner.link;
		}
		return newRunner;
	}

	public static void main(String args[])
	{
		Prob_2_5 prob = new Prob_2_5();
		Node[] nodes = new Node[6];

		for ( int i = 4 ; i >=0 ; i-- )
		{
			nodes[i] = new Node();
			nodes[i].data = i;
			nodes[i].link = nodes[i+1];
		}
		nodes[4].link = nodes[2];

		System.out.println(prob.findLoopStartUsingSet(nodes[0]));

		System.out.println("All tests completed");
	}

}