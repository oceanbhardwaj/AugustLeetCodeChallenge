class Solution {
    public int[] distributeCandies(int candies, int num_people) {
      int n=num_people;
        int arr[]=new int[n];
        int c=1;
       
        
        int d=0;
        while(((d+n)%n)<n)
        {
            if(candies>c)
            arr[(d+n)%n]+=c;
            else 
            {
                arr[(d+n)%n]+=candies;
                break;
            }
            candies=candies-c;
            c++;
            d++;
        }
        return arr;
    }
}