import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%4==0){
            if(a%400==0){
                System.out.print(a+ " Leap year");    
            }
            else{
                System.out.print(a+" Leap year");
            }
        }
        else{
                System.out.print(a+" Not leap year");
            }
        
    }
}