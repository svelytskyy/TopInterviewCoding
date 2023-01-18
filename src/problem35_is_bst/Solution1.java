package problem35_is_bst;

//recursive : valid range

public class Solution1 {
	
    private boolean validate(TreeNode<Integer> root, Integer low, Integer high) {
        if (root == null) {
            return true;
        }
        if ((low != null && root.getVal() <= low) || (high != null && root.getVal() >= high)) {
            return false;
        }
        /*
        	For left child :                	For right child :
        	Low – same from parent          	Low – limited by parent value
        	Upper – limited by parent value     Upper – same from parent
		*/
        return validate(root.getLeft(), low, root.getVal()) && 
        	   validate(root.getRight(), root.getVal(), high);
    }

    public boolean isValidBST(TreeNode<Integer> root) {
        return validate(root, null, null);
    }

}
