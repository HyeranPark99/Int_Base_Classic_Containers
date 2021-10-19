package AppendingSequence;

public class ArrayBagTest {
	
	public static void main(String[] args) {
		
		ArrayBag b = new ArrayBag();
		ArraySet c = new ArraySet();
		
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(1);
		System.out.println(b.contains(1));
		System.out.println(b.contains(5));
		System.out.println(b.toString());
		
		b.remove(1);
		System.out.println(b.toString());
		System.out.println(b.size());
		
		
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(1);
		c.remove(1);
		System.out.println(c.toString());
		System.out.println(c.size());
		
	}

}
