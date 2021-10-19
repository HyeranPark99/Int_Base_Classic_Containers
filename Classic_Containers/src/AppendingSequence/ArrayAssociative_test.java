package AppendingSequence;

public class ArrayAssociative_test {

	public static void main(String args[]) {
		
		ArrayAssociative a = new ArrayAssociative();
		
		a.isEmpty();
		a.add(1);
		a.isEmpty();
		a.add(17);
		a.add(12);
		a.contains(12);
		a.contains(17);
		a.add(17);
		System.out.println(		a.contains(17));
		System.out.println(		a.toString());
		a.toString();
		a.remove(17);
		a.remove(17);
		System.out.println(		a.contains(17));
		System.out.println(		a.toString());
		
		
		
		
	}
}
