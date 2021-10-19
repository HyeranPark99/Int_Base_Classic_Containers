package AppendingSequence;

public class SearchValue {

	private ArraySequence arraySequence = new ArraySequence();
	
	

	

	public static void main(String[] args) {
		
		
		int [] a = {12,75,34,56};
		System.out.println(a.length);
		int val = 1;
		int pos=0;
		System.out.println("test");
		for(int i = 0;i<a.length ;i++) {
			System.out.println(i);
			if(val == a[i]) {
				pos = i;
				break;
			}else {
				pos=-1;
			}
			
			System.out.println(pos +"loop");
		}
		
		System.out.println(pos);
	}
	

}
