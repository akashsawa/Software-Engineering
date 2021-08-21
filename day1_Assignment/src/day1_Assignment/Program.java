package day1_Assignment;

import java.util.Scanner;

public class Program 
{
	private static Scanner sc = new Scanner (System.in);
	
	private static int menuList()
	{
		System.out.println("ENTER  1. PUSH");
		System.out.println("ENTER  2. POP");
		return sc.nextInt();
	}
	
	public static void main(String[] args) 
	{
		System.out.println("ENTER SIZE OF STACK ");
		Stack s=new Stack(sc.nextInt());
		int ch;
		try
		{
		while((ch=menuList())!=0)
		{
			switch (ch)
			{
				case 1: 
					System.out.println("ENTER NUMBER: ");
					s.Push(sc.nextInt());
				break;
				
				case 2: System.out.println("POPPED ELEMENT : "+s.Pop());
				break;
				
			}
		}
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
