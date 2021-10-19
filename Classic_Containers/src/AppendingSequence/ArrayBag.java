package AppendingSequence;

public class ArrayBag {
	
	ArrayAssociative arrayAssociative = new ArrayAssociative();
	
	public void add(int value) { 
		arrayAssociative.add(value);
	}
	
	public void remove(int value) {
		arrayAssociative.remove(value);
	}
	
	public boolean contains(int value) {
		return arrayAssociative.contains(value);
	}
	
	public int size() {
		return arrayAssociative.size();
	}
	
	public boolean isEmpty() {
		return arrayAssociative.isEmpty();
	}
	
	public String toString() {
		return arrayAssociative.toString();
	}
	
	

}
