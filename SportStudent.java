import java.util.*;
interface Student
{
int score=50;
void displayscore();
}
interface Sports{
int score=25;
void displaySportsscore();
}
class Result implements Student,Sports
{
public void displayscore()
{
System.out.println("Academic score:" +Student.score);
}
public void displaySportsscore()
{
System.out.println("Sports score:" +Sports.score);
}
}
class SportStudent{
public static void main(String[]args)
{
Result r=new Result();
r.displayscore();
r.displaySportsscore();
}
}
