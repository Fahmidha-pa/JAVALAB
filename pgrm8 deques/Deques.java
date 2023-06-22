import java.util.*;
public class Deques
{
public static void main(String[]args)
{
Deque<String>deque=new ArrayDeque<String>();
deque.add("A");
deque.add("P");
deque.add("P");
deque.add("L");
deque.add("E");
System.out.println("Elements in deque is");
for(String str:deque)
{
System.out.print(str+"");
}
deque.remove();
System.out.println("\nAfter first element deleted");
for(String str:deque)
{
System.out.print(str+"");
}
deque.clear();
System.out.println("\nAfter all elements deleted");
for(String str:deque)
{
System.out.print(str+"");
}
}
}


