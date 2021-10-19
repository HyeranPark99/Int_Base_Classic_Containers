package AppendingSequence;

public class ArraySequence {

	int get(int pos) {
		
		return arrayArray.get(pos);
	}
	
	void set(int pos, int val) {
		arrayArray.set(pos, val);
	}
	
	
	void add(int pos, int val) {	
			for( int i = size; i > pos; i--) {
				set(size, get(i-1));	
		}
		arrayArray.set(pos, val);
		size++;
	}
	
	
	int remove(int pos) {
		int value  = arrayArray.get(pos);
		for(int i = pos; i < size; i++ ) {
			set(i,get(i+1));
		}
		arrayArray.set(size, 0);
		size--;
		return value;
	}
	
	int capacity()	{
		return arrayArray.length();
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		
		boolean result = true;
		for(int i = 0; i< arrayArray.length() ; i++	 ) {
			if(arrayArray.get(i) != 0)
				result = false;
		}
		
		return result;
	}
	
	public String toString() {
	//	System.out.println(size);
		String result = "{";
		for (int i = 0; i < size(); i++)
			result += get(i) + (i < size()-1 ? ", " : "");
		result += "}";
		return result;
		
		
	}
	
	int size = 0;
	ArrayArray arrayArray = new ArrayArray();
	

	
}


