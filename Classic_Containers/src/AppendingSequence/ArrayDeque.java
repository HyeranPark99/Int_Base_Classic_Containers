package AppendingSequence;

public class ArrayDeque {
	
	public void addFirst(int val) {
		arraySequence.add(0, val);
	}
	
	public void addLast(int val) {
		arraySequence.add(0+arraySequence.size(), val);
	}
	
	public int removeFirst()	{
		return arraySequence.remove(0);
	}
	
	public int removeLast() {
		return arraySequence.remove(arraySequence.size()-1);
	}
	
	
	public String toString(){
		return arraySequence.toString();
	} 
	
	public boolean isEmpty() {
	return arraySequence.isEmpty();
}
	
	
	private ArraySequence arraySequence = new ArraySequence();

	
	public static void main(String[] args) {
		ArrayDeque a = new ArrayDeque();
		
		a.addLast(1);
		a.addFirst(3);
		System.out.println(a.toString());
		a.addFirst(7);
		System.out.println(a.toString());
		a.addLast(6);
		System.out.println(a.toString());
		a.removeFirst();
		System.out.println(a.toString());
		a.removeLast();
		System.out.println(a.toString());
		a.removeLast();
		System.out.println(a.toString());
		
	}
}
