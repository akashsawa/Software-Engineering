package day1_Assignment;

import com.app.Exception.stackOverflowException;
import com.app.Exception.stackUnderflowException;

public class Stack implements StackIntf
{
	private int arr[];
	private int top = -1;
	
	
	public Stack(int size) 
	{
		super();
		this.arr = new int[size];
	}

	@Override
	public void Push(int elem) throws stackOverflowException
	{
		if(this.IsFull())
			throw new stackOverflowException("STACK IS FULL ");
		this.arr[++this.top]=elem;

	}
	@Override
	public int Pop() throws stackUnderflowException
	{
		if(this.IsEmpty())
			throw new stackUnderflowException("stack is empty");
		return this.arr[this.top--];
		
	}

	@Override
	public boolean IsEmpty() 
	{
		if(this.top==-1)
			return true;
		return false;
	}

	@Override
	public boolean IsFull()
	{
		if(this.top==this.arr.length-1)
			return true;
		return false;
	}
	
}
