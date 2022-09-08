package While;

public class Exercise39 {

	public static void main(String[] args) {
		int index = 1, previousNumber = 0, nextNumber = 1, sumNumbers = 0;

		while (index < 31) {
			System.out.printf("\n%d", nextNumber);
			sumNumbers = nextNumber + previousNumber;
			previousNumber = nextNumber;
			nextNumber = sumNumbers;
			index = index + 1;
		}
	}
}