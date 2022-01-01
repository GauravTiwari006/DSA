class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length)
        {
            while(i<nums1.length-1 && nums1[i]==nums1[i+1])
            {
                i++;
            }
            while(i<nums2.length-1 && nums2[i]==nums2[i+1])
            {
                j++;
            }
            if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++;
            else{
                nums1[k++]=nums1[i];
                ++i;++j;
            } 
        }
        
        int ans[]=new int[k];
        for(i=0;i<k;i++){
            ans[i]=nums1[i];
        }  
        return ans;
    }
}