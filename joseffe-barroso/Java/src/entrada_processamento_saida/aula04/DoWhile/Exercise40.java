package DoWhile;

public class Exercise40 {

	public static void main(String[] args) {
		int index = 1, firstNumber = -1, secondNumber = 1, thirdNumber = 1, sumNumbers = 0;

		do {
			System.out.printf("\n%d", secondNumber);
			sumNumbers = secondNumber + firstNumber + thirdNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
			thirdNumber = sumNumbers;
			index = index + 1;
		} while (index < 31);
	}

}