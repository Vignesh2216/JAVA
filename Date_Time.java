// You are using Java
import java.util.*; 
import java.text.*; 
import java.time.*; 
class main {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in); 
        int x=t.nextInt(); 
        int y=t.nextInt(); 
        int z=t.nextInt(); 
        Calendar a=Calendar.getInstance(); 
        SimpleDateFormat h=new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        h.setTimeZone(TimeZone.getTimeZone("GMT")); 
        a.set(x,y,z,0,0,0); 
        System.out.println();
        System.out.println(h.format(a.getTime())); 
        System.out.println();
    } 
}