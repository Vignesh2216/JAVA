import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[][] a=new int[n][x];
        for(int i=0;i<n;i++){
            for(int j=0;j<x;j++){
                a[i][j]=i+j;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<x;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}