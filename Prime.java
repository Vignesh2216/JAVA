import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean x=false;
        if(a>1){
        for(int i=2;i<=(a/2);i++){
            if(a%i==0){
                x=true;
            }
        }
        if(x){
            System.out.print(a+":Composite");
        }
        else{
            System.out.print(a+":Prime");
        }
        }
        else{
            System.out.print(a+":Invalid");
        }
    }
}