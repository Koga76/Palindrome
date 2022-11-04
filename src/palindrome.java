import java.util.Scanner;

public class palindrome {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int count=0;
        int size=S.length();
        //glxlg  size=5
        //fccf   size=4
        //abcda  size=4
        for (int i = 0; i<(size/2) ; i++) {
            if(S.charAt(i)!=S.charAt(size-i-1))count++;

        }
        if (size%2!=0 && count==0)count++;
        if(count==1){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}