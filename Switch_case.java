// You are using Java
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            case 1:
            case 2:
            case 12:
                System.out.print("Winter!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print("Spring!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("Summer!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("Fall!");
                break;
            default:
            {
                System.out.print("Invalid input.");
            }
        }
    }
}