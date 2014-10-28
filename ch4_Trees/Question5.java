package chapter4;

public class Question5 {

	
	public static void main(String[] args) {
		BinaryTree root =new BinaryTree(5);
		root.addLeft(root, 1);
		root.addRight(root, 6);
		root.addLeft(root, 2);
		root.addRight(root, 3);
		root.printTree(root);
	}
}
