import java.util.Scanner;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double c=sc.nextInt();
        double d=((1.8*c)+32);
        System.out.print(d);
	}
}