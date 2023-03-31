import java.util.*;
import java.util.Scanner;
class Cpu{
       int price=4000;
       
    class Processor{
        int noOfCores=4;
        String manufacturer="intel corp";
void display(){
System.out.println("No of cores:"+noOfCores);
System.out.println("Manufacturer:"+manufacturer);
}
}

void display(){
Processor p=new Processor();
p.display();
System.out.println("Price:"+price);
}

static class Ram{
int memmory=8;
String manufacture="corps";
void display(){
System.out.println("Memmory:"+memmory);
System.out.println("Manufacturer:"+manufacture);
}
}
}
public class Cpus{
public static void main(String[]args){
Cpu c1=new Cpu();
c1.display();
Cpu.Ram r1=new Cpu.Ram();
r1.display();
}
}

