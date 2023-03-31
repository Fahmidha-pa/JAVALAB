import java.util.*;
import java.util.Scanner;
public class Matrix
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of rows:");
int m=sc.nextInt();
System.out.println("Enter no of columns:");
int n=sc.nextInt();
int[][] matrix1=new int[m][n];
int[][] matrix2=new int[m][n];
int[][] matrix3=new int[m][n];
System.out.println("Enter first matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
matrix1[i][j]=sc.nextInt();
}
}
System.out.println("Enter second matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
matrix2[i][j]=sc.nextInt();
}
}
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
}
}
System.out.println("Addition of two matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(matrix3[i][j]+"\t");
}
System.out.println();
}
}
}
