// You are using Java
// You are using Java
import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.IOException; 
 class CreateFile 
{ 
    public static void main(String[] args) throws IOException 
    { 
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        FileWriter fw=new FileWriter("E:\\output.txt");
        for(int i=0;i<n;i++){
            fw.write(arr[i]);
        }
        fw.close();
        FileReader fr=null;
        try{
            fr=new FileReader("E:\\output.txt");
        }
        catch(FileNotFoundException fe){
            System.out.println("File not found");
        }
        int ch,sum=0;
        while((ch=fr.read())!=-1){
            System.out.print(ch+" ");
            sum+=(int)ch;
        }
        System.out.println(sum);
        fr.close();
    }
}