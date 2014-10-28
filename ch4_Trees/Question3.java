package chapter4;

public class Question3 {

	
	public static void main(String[] args) {
		TreeNode root;
		int a[]={1,2,3,4,5,6,7};
		Question3 q3 =new Question3();
		root=q3.createMinimalHeightTree(a, 0, a.length-1);
		
		q3.inorderTraversal(root);
	}
	
	public void inorderTraversal(TreeNode root){
		
		if(root!=null)
		{
			inorderTraversal(root.left);
			System.out.println(root.data);
			inorderTraversal(root.right);
			
		}
	}
	
	public TreeNode createMinimalHeightTree(int a[],int start,int end){
		
		if(end<start)
			return null;
		
		int median = (start+end)/2;
		
		TreeNode root = new TreeNode(a[median]);
		
		root.left = createMinimalHeightTree(a, start, median-1);
		root.right = createMinimalHeightTree(a, median+1, end);
		
		return root;
	}
}
