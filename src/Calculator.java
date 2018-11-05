import java.util.*;
public class Calculator {
	 Stack<Integer> stack = new Stack<>();

	   
	   
	public void loadConstant(int i) {
		stack.push(i);
	}

	public void add() {
		// TODO Auto-generated method stub
		
	}

	public void subtract() {
		// TODO Auto-generated method stub
		
	}

	public void multiply() {
		// TODO Auto-generated method stub
		
	}

	public void divide() {
		// TODO Auto-generated method stub
		
	}

	public void total() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		String stringStack = "["; 
		
		if(stack.empty()) {
			return "[].";
		}else {
			for(Integer number : stack) {
				stringStack += number.toString(); 
				stringStack += " ";
			}
			String newStack = stringStack.substring(0, stringStack.length()-1);
			newStack += "].";
			return newStack; 
			
		}
		
	}
	
}
