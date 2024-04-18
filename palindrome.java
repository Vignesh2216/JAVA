import java.util.*;
class MAin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String r="";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            r+=s.charAt(i);
        }
        int c=0;
        for(int j=0;j<n;j++){
            if(s.charAt(j)==r.charAt(j))
            c++;
        }
        if(c==n){
            System.out.println(s+" :palindrome");
        }
        else{
            System.out.println(s+" :not a palindrome");
        }
    }
}