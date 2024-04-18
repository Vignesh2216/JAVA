import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int d=(a*2-2)/2;
        int c=d;
        for(int i=0;i<a-1;i++){
        for(int j=0;j<a*2-1;j++){
            if(j==c && c==d){
                System.out.print("*");
                break;
            }
            else if(j==c){
                System.out.print("*");
            }
            else if(j==d){
                System.out.print("*");
                break;
            }
            else{
                System.out.print(" ");
            }
        }
        c--;
        d++;
        System.out.println();
        }
        for(int i=0;i<a*2-1;i++){
            System.out.print("*");
        }
    }
}