import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b;
        System.out.println("Given Digits :"+a);
        System.out.print("Reverse Digits :");
        for(int i=0;a!=0;i++){
            b=a%10;
            a/=10;
            System.out.print(b);
        }
    }
}