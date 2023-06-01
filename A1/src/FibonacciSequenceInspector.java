public class FibonacciSequenceInspector {
	public static int calls = 0;
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for (int i = 1;i<=n;i++) {
			System.out.print(fib(i)+" ");
		}
		System.out.println("\n"+"Calls: "+calls);
	}
	public static int fib(int num) {
		if (num==1||num==2||num==3||num==4) {
			calls++;
			return 1;
		}
		else {
			int current = fib(num-2)*3+fib(num-3);
			calls++;
			return current;
		}
	}
}
