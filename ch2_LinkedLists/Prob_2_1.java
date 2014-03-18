/*
2.1 Write code to remove duplicates from an unsorted linked list 
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?


class Node<T extends Comparable<T>> implements Comparable<Node<T>>
{
	T data;
	Node<T> link;

	public int compareTo(Node<T> obj1)
	{
		//return 0;
		return this.data.compareTo(obj1.data);
	}
}


public class Prob_2_1<K extends Comparable<Node<K>>> 
{

	public Node<K> removeDuplicates(Node<K> head)
	{
		if (head == null) return null;

		Node<K> temp = head.link, prev = head;
		Node<K> runner;

		while (temp != null)
		{
			runner = head;
			while (runner != temp)
			{
				if (0 == runner.compareTo(temp))
				{
					prev.link = temp.link;
					temp.link = null;
					temp.data = null;
					break;
				}
			}
			temp = temp.link;
		}
		return head;
	}

	public String toString(Node head)
	{
		String output = "";
		Node temp = head;
		while (temp != null)
		{
			output += "[ " + temp.data + "],";
		}
		return output;
	}

	public static void main(String args[])
	{
		Node<Integer> nodes[] = new Node<Integer>[5];
		nodes[0].data = 1;
		nodes[0].link = nodes[1];
		nodes[1].data = 1;
		nodes[1].link = nodes[2];
		nodes[2].data = 2;
		nodes[2].link = null;

		Prob_2_1<Integer> prob = new Prob_2_1<Integer>();
		System.out.println(prob.toString(nodes[0]));

		Node<Integer> head = prob.removeDuplicates(nodes[0]);
		System.out.println(prob.toString(head));

		System.out.println("All tests completed");

	}
}

*/
