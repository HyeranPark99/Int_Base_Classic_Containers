package AppendingSequence;

public class ArrayArray {
	
	int [] array = new int[CAPACITY];
	private static int CAPACITY = 100;
	
	int get(int pos) {return array[pos];}
	void set(int pos, int val) {array[pos] = val;}
	int length() {return array.length;}
	public String toString() {
		String result = "{";
		for (int i = 0; i < array.length; i++)
			result += array[i] + (i < array.length-1 ? ", " : "");
		result += "}";
		return result;
	}
	
}
