package pilasconlistas;
import java.util.Iterator;
import java.lang.reflect.Array;
import node.node;

public class PilasconListas<T extends Comparable<T>>implements iPilasconListas<T>,Iterable<T>   {
	private T[] data = null;
	private int top = -1;
	private int count = 0;
	private int tope = 8;

private node<T> start = null, end = null;
	
	
	public PilasconListas(){
		start = new node<T>();
		start.setIndex(-1); //
		end = new node<T>();
		end.setIndex(-1);
	}
	public PilasconListas(T value){
		this();
		end.setBack(new node<T>(value));
		start.setNext(end.getBack());
		start.getNext().setIndex(0); // 
	}
		
public void push(T value) throws StackFullException {
	if(isfull()) throw new StackFullException("Pila llena");
	node<T> tmp = end.getBack();
	end.setBack(new node<T>(value));
	
	if(tmp == null){
		start.setNext(end.getBack());
		end.getBack().setIndex(0);
	}else{
		end.getBack().setBack(tmp);
		tmp.setNext(end.getBack());
	}
	top++;
	count++;
}		
@Override
public Iterator<T> iterator() {
	
	return new Iterator<T>() {
		int _count = top;
		@Override
		public boolean hasNext() {
			
			return (_count >= 0);
		}

		@Override
		public T next() {
			end=end.getBack();
			_count--;
			return end.getValue();
		}
	};
}
@Override
public T pop() throws StackEmptyException {
	if(isempty()) throw new StackEmptyException("Pila vacia");
	
	T tmp =end.getBack().getValue();
	end=end.getBack();
	count--;
	top--;
	return tmp;
	
}
@Override

public boolean isempty() {
	// TODO Auto-generated method stub
	return (count==0);
}
@Override
public boolean isfull() {
	// TODO Auto-generated method stub
	return (count==tope);
}
@Override
public T peek() throws StackEmptyException {
	if(isempty()) throw new StackEmptyException("Pila vacia");
	T tmp = end.getBack().getValue();
	
	return tmp;
}
@Override
public int size() {
	// TODO Auto-generated method stub
	return count;
}
@Override
public T search(T value) throws StackEmptyException {
	if(isempty()) throw new StackEmptyException("Pila vacia");

	while(start.getNext().getValue()!=end.getBack().getValue()){
	if(start.getNext().getValue()==null)return null;
	if(start.getNext().getValue().equals(value)){return value;}
	else if (start.getNext().getValue().equals(value))
			start=start.getNext().getNext();}
	
	return value;
		
}
@Override
public void clear() {
	top = -1;
	count=0;
	
}
		
/////////////////////////////////////////////////////////////////////////////////7
	
		
	 
}