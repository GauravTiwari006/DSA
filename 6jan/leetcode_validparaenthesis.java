 //leetcode_validparaenthesis
 public class Solution {
    public boolean isValid(String s) {
        int count1 = 0,count2 = 0,count3 = 0;
        for(int i=0;i<s.length();i++){
        
        	if('('==s.charAt(i)) count1++;
            else if('{'==s.charAt(i)) count2++;
            else if('['==s.charAt(i)) count3++;
            else if(')'==s.charAt(i)) count1--;
            else if('}'==s.charAt(i)) count2--;
            else if(']'==s.charAt(i)) count3--;
            
            if(count1<0||count2<0||count3<0) return false;
            else if(')'==s.charAt(i)){
            	if('['==s.charAt(i-1)||'{'==s.charAt(i-1)) return false;}
            else if('}'==s.charAt(i)){
            	if('['==s.charAt(i-1)||'('==s.charAt(i-1)) return false;}
            else if(']'==s.charAt(i)){ 
            	if('('==s.charAt(i-1)||'{'==s.charAt(i-1)) return false;}
            
        }
        if(count1==0&&count2==0&&count3==0)
        return true;
        else
        return false;
    }
}