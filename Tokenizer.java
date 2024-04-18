// You are using Java
import java.util.*; 
class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        String str=sc.nextLine(); 
        StringTokenizer token=new StringTokenizer(str);
        System.out.println("Tokens:"); 
        while(token.hasMoreElements()) {
            System.out.println(token.nextElement()); 
        } 
    } 
}