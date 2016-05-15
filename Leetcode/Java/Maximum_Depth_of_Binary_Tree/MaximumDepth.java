package Maximum_Depth_of_Binary_Tree;

public class MaximumDepth {
	int depth;
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		else if (root.left == null || root.right == null) {
			return 1;
		}
		else {
			depth = Math.max(maxDepth(root.left), maxDepth(root.right));
			return depth + 1;
		}
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int v) {
		val = v;
	}
}