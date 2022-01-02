import java.util.Arrays;
import java.util.Scanner;

public class mcq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char ch[] = str.toCharArray();

        Arrays.sort(ch);
        int n = ch.length;

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++) {
                if (ch[i] == ch[j]) {
                    ch[i] = '*';
                }
            }
        }
        String string = "";

        for (int i=0;i<=n-1;i++){
            if(ch[i]!='*'){
                string +=ch[i];
            }
        }
        System.out.println(string);
    }
}