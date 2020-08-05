class Solution {
    class TrieNode{
      TrieNode left;
        TrieNode right;
        
    }
      void insert(int n,TrieNode head)
     {
        TrieNode curr=head;
         for(int j=31;j>=0;j--)
         {
           int b=(n>>j)&1;
             if(b==0)
             { if(curr.left==null)
                 curr.left=new TrieNode();
              curr=curr.left;
                 
             }
             else
             {
                 if(curr.right==null)
                     curr.right=new TrieNode();
                 curr=curr.right;
             }
         }
         
         
         
     }
     int xor(TrieNode head,int nums[])
    {   int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int value=nums[i];
            TrieNode curr=head;
            int curr_xor=0;
            for(int j=31;j>=0;j--)
            {
                int c=(value>>j)&1;
                if(c==0)
                {
                    if(curr.right!=null)
                    {
                        curr_xor=curr_xor+(1<<j);
                        curr=curr.right;
                    }
                    else
                        curr=curr.left;
                }
                else
                {
                    if(curr.left!=null)
                    {
                        curr_xor=curr_xor+(1<<j);
                        curr=curr.left;
                    }
                    else
                        curr=curr.right;
                }   
                    
            }
            max=Math.max(curr_xor,max);
                    
        }
     return max;
                    
    }         
     public int findMaximumXOR(int[] nums) {
        TrieNode head=new TrieNode();
        
         
        for(int i=0;i<nums.length;i++)
        {
            insert(nums[i],head);
        }
       
        
       return  xor(head,nums);
    }
}