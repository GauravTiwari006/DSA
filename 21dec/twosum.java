class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length-1;
        int f=-1,l=-1,sum=0;
        for(int i=0;i<=n-1;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                sum=numbers[i]+numbers[j];
                if(sum==target)
                {
                    f=i+1;
                    l=j+1;
                    break;
                }       
            }
        }
        int ans[]={f,l};
        return ans;
    }
}