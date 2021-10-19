package AppendingSequence;

public class ArraySequenceTest {
	public static void main(String [] args ) {
		
		ArraySequence arraySequence = new ArraySequence();
		int number = 0;
		
		
		
		
		arraySequence.isEmpty();
		arraySequence.add(0, 1);
		arraySequence.isEmpty();
		arraySequence.add(0, 2);
		arraySequence.add(1, 3);
		System.out.println(arraySequence.toString());
		arraySequence.size();
		System.out.println(arraySequence.size());
		arraySequence.remove(2);
		System.out.println(arraySequence.toString());
		int b = arraySequence.remove(1); 
		System.out.println(b);
		int c =arraySequence.remove(0);
		System.out.println(c);
		System.out.println(arraySequence.isEmpty());
		
	}
	
	private ArrayArray arrayArray = new ArrayArray();
	
	public int get(int pos) {
		return arrayArray.get(pos);
		
	}
	

}
