class Solution {
    public int[] sortArrayByParity(int[] A) {
       /* int arr[]=new int[A.length];
        int start=0;
        int end=A.length-1;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
                arr[start++]=A[i];
            else
                arr[end--]=A[i];
        }
        return arr;*/
        
        int i=0;
        int j=A.length-1;
        while(i<j)
        {
            
            while(i<A.length && A[i]%2==0)
            {
                i++;
            }
            while(j>0 && A[j]%2==1)
            {
                j--;
            }
            if(i<j){
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;}
            
            
        }
        return A;
        
        
        
    }
}