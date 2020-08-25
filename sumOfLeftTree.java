class Solution {
    private int sum=0;
    
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null )
        return 0;
         sumOFleft(root,false);
        return sum;
    }
     void sumOFleft(TreeNode root,boolean isLeft)
    { if(isLeft==true && root.left==null && root.right==null)
    {
        sum+=root.val;
        return;
    }
        
if(root.left!=null)
     sumOFleft(root.left,true);
     if(root.right!=null)
          sumOFleft(root.right,false);
        
        
        
        
    }
}