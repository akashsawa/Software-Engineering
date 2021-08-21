package com.app.Queue;

import java.util.Scanner;

public class Program 
{
	private static Scanner sc = new Scanner (System.in);
	
	private static int menuList()
	{
		System.out.println("0.EXIT");
		System.out.println("ENTER  1. PUSH");
		System.out.println("ENTER  2. POP");
		return sc.nextInt();
	}
	
	public static void main(String[] args) 
	{
		System.out.println("ENTER SIZE OF QUEUE ");
		Queue q=new Queue(sc.nextInt());
		int ch;
		try
		{
		while((ch=menuList())!=0)
		{
			switch (ch)
			{
				case 1: 
					System.out.println("ENTER NUMBER: ");
					q.AddQ(sc.nextInt());
				break;
				
				case 2: System.out.println("POPPED ELEMENT : "+q.DeleteQ());
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
