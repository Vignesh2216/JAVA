import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n]; 
        int[][] b=new int[n][n]; 
        int[][] c=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("ADD:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int q=a[i][j]+b[i][j];
                System.out.print(q+" ");
            }
            System.out.println();
        }
        System.out.println("SUBTRACT: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int q=a[i][j]-b[i][j];
                System.out.print(q+" ");
            }
            System.out.println();
        }
        System.out.println("PRODUCT: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]=0;
                for(int k=0;k<n;k++){
                c[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}