package com.app.Queue;

public interface QueueIntf {
	public void AddQ(int elem) throws Exception;
	public int DeleteQ() throws Exception;
	public boolean IsEmpty();
	public boolean IsFull();
}
