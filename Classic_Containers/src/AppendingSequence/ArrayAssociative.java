package AppendingSequence;

public class ArrayAssociative {
	
	ArraySequence arraySequence = new ArraySequence();
	
	public void add(int value) {
		
		arraySequence.add(arraySequence.size(), value);
	}
	
	
	public void remove(int value) {
		for (int i=0; i< arraySequence.size(); i++) {
			if(find(value)!= -1) {
			arraySequence.remove(find(value));
			}
		}
		//arraySequence.remove(find(value));

	}
	
	



	
	
	public boolean contains(int value) {
		
		if(find(value) != -1) {
			return true;
		}
		return false; 
	}
	
	
	
	

	
	
	private int find(int value) {
	int pos=0;
	for(int i = 0; i < arraySequence.size(); i++){
		if(value == arraySequence.get(i)){
			pos = i;
			return pos;
		}else{
			pos = -1;
		}	
	}
	
	return pos;
}
	
	
	public int size() {
		return arraySequence.size();
	}
	public boolean isEmpty() {
		return arraySequence.isEmpty();
	}

	public String toString() {
		return arraySequence.toString()	;
	}
	
	

}
