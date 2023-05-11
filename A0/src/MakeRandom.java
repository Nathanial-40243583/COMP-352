import java.util.Random;
public class MakeRandom {
	public static void main(String[] args) {
		int[] arr=null;
		if (args.length==1) {
			Random r = new Random();
			arr = new int[Integer.parseInt(args[0])];
			for (int i = 0; i<arr.length;i++) {
				arr[i] = r.nextInt(Integer.MAX_VALUE);
			}
		}
		else if (args.length==2) {
			Random r = new Random(Long.parseLong(args[0]));
			arr = new int[Integer.parseInt(args[1])];
			for (int i = 0; i<arr.length;i++) {
				arr[i] = r.nextInt(Integer.MAX_VALUE);
			}
		}
		for(int x: arr) {
			System.out.print(x+" ");
		}
		;
	}
}
