package chapter4;

public class BinaryTree {

	
	int data;
	BinaryTree left;
	BinaryTree right;
	
	BinaryTree(int data){
		this.data=data;
	}
	
	
	public void add(BinaryTree root,BinaryTree tree,String orientation){
		
		if(orientation.equals("L"))
		{
			root.left = tree;
		}
		else{
			root.right=tree;
		}
	}
	
	
	public void addLeft(BinaryTree root,int data){
		BinaryTree bt =new BinaryTree(data);
		
		if(root.left==null)
			root.left = bt;
		else{
			BinaryTree lTree=root.left;
			root.left = bt;
			bt.left = lTree;
		}
		
	}
	
	public void addRight(BinaryTree root , int data){
		BinaryTree bt =new BinaryTree(data);
		if(root.right==null)
			root.right = bt;
		else{
			BinaryTree lTree=root.right;
			root.right = bt;
			bt.right = lTree;
		}
	}
	
	public static void main(String[] args) {
		BinaryTree root =new BinaryTree(5);
		/*BinaryTree t1 =new BinaryTree(6);
		BinaryTree t2 =new BinaryTree(7);
		BinaryTree t3 =new BinaryTree(8);
		BinaryTree t4 =new BinaryTree(9);
		
		root.add(root, t1, "L");
		root.add(root, t2, "R");
		t1.add(t1, t3, "L");
		t1.add(t1, t4, "R");*/
		
		root.addLeft(root, 6);
		root.addRight(root, 7);
		root.addLeft(root, 8);
		root.addRight(root, 9);
		
		
		root.printTree(root);
	}
	
	public void printTree(BinaryTree root){
		if(root!=null){
			
			printTree(root.left);
			System.out.println(root.data);
			
			printTree(root.right);
		}
	}
	
}
