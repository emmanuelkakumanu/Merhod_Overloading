
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	int m1(int a,int b)
	{
		return a+b;
	}
	float m1(float a,float b,float c)
	{
		return a+b+c;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Ideone obj=new Ideone();
		System.out.println("a+b : "+obj.m1(100,200));
		System.out.println("a+b+c : "+obj.m1(10.15f,20.200f,3.12f));
	}
}
