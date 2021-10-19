package AppendingSequence;
import java.util.*;

public class PostfixEvaluator {
	
	
	String exp;
	PostfixEvaluator(String exp)
	{
		this.exp = exp;
	}
	

	private boolean isOperand(String token)
	{
		return Character.isDigit(token.charAt(0));
	}
	
	
	int evaluation() {
		Scanner scanner = new Scanner(System.in);
		ArrayStack stk = new ArrayStack();
		
		while(scanner.hasNext()) {
			String token = scanner.next();
			if(isOperand(token)) {
				stk.push(Integer.parseInt(token));
			}else {
				int operand2 = stk.pop();
				int operand1 =stk.pop();
				stk.push(eval(token, operand1, operand2));
			}
		}
		
		return stk.pop();
		
	}
	
	int eval(String optr, int op1, int op2) {
		switch (optr) {
		case "+" : return op1 + op2;
		case "-" : return op1 - op2;
		case "*" : return op1 * op2;
		case "/" : return op1 / op2;
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("Usage : PostfixEvaluator <expression>");
		//	System.exit.(1);
		}
		String exp = "3+1";
	
		System.out.println(new PostfixEvaluator(args[0]));
		
	}
	

}
