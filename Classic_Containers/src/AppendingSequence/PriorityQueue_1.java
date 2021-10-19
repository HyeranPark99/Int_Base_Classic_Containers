package AppendingSequence;

public class PriorityQueue_1 {
	
	private ArraySequence arraySequence = new ArraySequence();
	

	
	//add value.
	public void add(int val) {
		arraySequence.add(arraySequence.size(), val);
	}
	
	//find the largest value and remove it
	// return the position
	public int remove() {
			int maxVal =arraySequence.get(0);
			int maxPos =0;
			for(int i = 1; i<arraySequence.size(); i++) {
				if(arraySequence.get(i)> maxVal) {
					maxPos = i;
					maxVal = arraySequence.get(i);				
				}
			}
			
			arraySequence.remove(maxPos);
		return maxVal;
	}

	
	public boolean isEmpty() {
			return arraySequence.isEmpty();
	}
	
	public String toString() {
		return arraySequence.toString();
	}
	
	
	public static void main(String[] args) {
		
		PriorityQueue_1 a = new PriorityQueue_1();
	 
		a.add(12);
		a.add(75);
		a.add(34);
		a.add(56);
		System.out.println(a.toString());	
		
		System.out.println(a.remove());
		//System.out.println(a.remove2());
		System.out.println(a.toString());
		
	}
	

}
