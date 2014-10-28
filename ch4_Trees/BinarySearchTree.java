package chapter4;

public class BinarySearchTree {

	TreeNode root;
	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.addNodes(4);
		bst.addNodes(2);
		bst.addNodes(3);
		bst.addNodes(1);
		bst.addNodes(5);
		bst.addNodes(8);
		
		//bst.inOrderTraverseTree(bst.root);
		
		
		bst.isNodePresent(8);
	}
	
	public void inOrderTraverseTree(TreeNode focusNode) {

		if (focusNode != null) {

			// Traverse the left node

			inOrderTraverseTree(focusNode.left);

			// Visit the currently focused on node

			System.out.println(focusNode.data);

			// Traverse the right node
			inOrderTraverseTree(focusNode.right);
		}

	}
	
	public void addNodes(int data){
		TreeNode newNode = new TreeNode(data);
		
		if(root == null)
			root = newNode;
		else{
			
			TreeNode focusNode = root;
			TreeNode parent;
			
			while(true){
				parent = focusNode;
				
				if(data<focusNode.data)
				{
					focusNode = focusNode.left;
					
					if(focusNode == null)
					{
						parent.left = newNode;
						return;
					}
				}
				else
				{
					focusNode = focusNode.right;
					
					if(focusNode == null)
					{
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	
	public void isNodePresent(int data){
		
		if(root == null)
			System.out.println("No");
		else{
		if(root.data==data)
		{
			System.out.println("Yes");
		}
		else if(data<root.data)
		{
			root = root.left;
			isNodePresent(data);
			
		}
		else if(data>root.data)
		{
			root=root.right;
			isNodePresent(data);
			
		}
		 
		}
	}
	
	
	public int heightOfTree(){
		int height=0;
		
		return height; 
	}
}
