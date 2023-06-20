import java.util.*;
import java.util.Scanner;
class Product
{
int pcode,price;
String pname;
Product(int pcode,String pname,int price)
{
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
}
class Products
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter product code:");
int pcode=sc.nextInt();
System.out.println("Enter product name:");
String pname=sc.next();
System.out.println("Enter product price:");
int price=sc.nextInt();
Product[] ps=new Product[3];
ps[0]=new Product(pcode,pname,price);
ps[1]=new Product(102,"book",35);
ps[2]=new Product(103,"pen",15);
int minprice=ps[0].price;
System.out.println("\npcode\tpname\tprice");
for(Product p:ps)
{
System.out.println(p.pcode+"\t"+p.pname+"\t"+p.price);
if(minprice>p.price)
{
minprice=p.price;
}
}
System.out.println("\nLowest cost product is");
for(Product p:ps)
{
if(minprice==p.price)
{
System.out.println("productcode: "+p.pcode);
System.out.println("productname: "+p.pname);
System.out.println("price: "+p.price);
}
}
}
}






