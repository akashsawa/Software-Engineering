package day1_Assignment;

public interface StackIntf {
	public void Push(int elem) throws Exception;
	public int Pop() throws Exception;
	public boolean IsEmpty();
	public boolean IsFull();
}
