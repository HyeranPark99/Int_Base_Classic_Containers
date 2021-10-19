package AppendingSequence;

public class ArrayStack {

	
	
	void push(int val) {
		arraySequence.add(arraySequence.size()+1, val);
	}
	
	int pop(){
		return arraySequence.remove(arraySequence.size());
	}
	
	boolean isEmpty() {
		return arraySequence.isEmpty();
	}
	
	
	
	ArraySequence arraySequence = new ArraySequence();
	
}
