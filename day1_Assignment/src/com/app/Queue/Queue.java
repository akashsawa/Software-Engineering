package com.app.Queue;

import com.app.Exception.stackOverflowException;
import com.app.Exception.stackUnderflowException;

public class Queue implements QueueIntf
{
	private int qarr[];
	private int rear=-1;
	private int front=-1;
	
	
	public Queue(int size)
	{
		this.qarr=new int[size];
	}
	@Override
	public void AddQ(int elem) throws Exception 
	{
		this.front=0;
		if(this.IsFull())
			throw new stackOverflowException("stack is full");
		qarr[++rear]=elem;
		
		
	}

	@Override
	public int DeleteQ() throws Exception 
	{
		//this.front++;
		if( this.IsEmpty())
			throw new stackUnderflowException("stack is empty");
		if(this.rear>=this.front)
			return this.qarr[front++];
		else
			throw new stackUnderflowException("stack is empty");
			
		
	}

	@Override
	public boolean IsEmpty() 
	{
		return (this.front==-1);
	}

	@Override
	public boolean IsFull() 
	{
		return this.rear==this.qarr.length-1;
			
	}
	
}

