package learning2;

public class Sqrt {
	public static void main(String[] args) {
		Sqrt test = new Sqrt();
		for (int i = 0; i < 20; i++) {
			int input = i;
			int result = test.mySqrt(i);
			System.out.println(i + " sqrt: " + result);
		}
		System.out.println(test.mySqrt(9));
		assert test.mySqrt(2147395599)==46339 : "wrong answer";
	}

	public int mySqrt(int x) {
		if (x == 1)
			return 1;
		double low = 0;
		double high = x;
		double sqrt = 0;
		while (Math.abs(low - high) > 0.01) {
			sqrt = (low + high) / 2.0;
			low =  x / sqrt;
			high =  sqrt;
		}
		return (int)Math.min(low, high);
	}
}
