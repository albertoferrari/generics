
public class Main {

	public static void main(String[] args) {

		Stack<Integer> countdown = new Stack<Integer>();
		for (int i = 0; i <= 10; i++) {
			countdown.push(i);
		}

		while (countdown.size() > 0) {
			System.out.println(countdown.pop());
		}
		
		// countdown.push("a");			// Compile Time Error

	}

}