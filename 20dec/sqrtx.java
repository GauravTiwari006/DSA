class Solution {

    public int mySqrt(int x) {

        int start=0;

        int end=x-1;

        if(x==1||x==0){

            return x;

        }

        while(start<=end){

            long mid = start+(end-start)/2;

            long square = mid*mid;

            

            if(square<x){

                start=(int)mid+1;

            }

            else if(square>x){

                end=(int)mid-1;

            }

            else{

                return (int)mid;

            }

        }

        return end;

    }

}