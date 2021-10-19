package AppendingSequence;

public class ArraySet {

	
	public void add(int value) {
		if(!arrayAssociative.contains(value)) 
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

	ArrayAssociative arrayAssociative = new ArrayAssociative();
	
	
}
