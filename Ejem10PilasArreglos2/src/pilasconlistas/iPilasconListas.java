package pilasconlistas;

public interface iPilasconListas<T> {
	
	public T pop() throws StackEmptyException;
	public void push(T value) throws StackFullException;
	public boolean isempty();
	public T peek() throws StackEmptyException;
	public int size();
	public void clear();
	public T search(T value) throws StackEmptyException;
	boolean isfull();
	
	
}
