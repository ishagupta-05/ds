//wap in java to perform function overloading

import java.util.Scanner;
class student
{
String name,uid,s;
float total,avg;

void data()
{
System.out.println("enter the data of the student");
Scanner ob =new Scanner(System.in);
System.out.println("enter the name of the student");
name=ob.nextLine();
System.out.println("enter the student id ");
uid=ob.nextLine();
System.out.println("enter the status of the student");
total=ob.nextFloat();

avg=total/5;

if(avg<30)
{
s="fail";
}
else
{
s="pass";
}


System.out.println("the details are");
System.out.println("name is "+name);
System.out.println("the  id is "+uid);
System.out.println("the average is "+avg);
System.out.println("thw status is  "+s);


}

void data(String name1,String uid1,float total1)
{
avg=total1/5;


if(avg<30)
{
s="fail";
}
else
{
s="pass";
}

System.out.println("the details are");
System.out.println("name is "+name1);
System.out.println("the  id is "+uid1);
System.out.println("the average is "+avg);
System.out.println("thw status is  "+s);
}
}