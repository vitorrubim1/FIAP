package For;

public class Exercise40 {

	public static void main(String[] args) {
		int index = 1, firstNumber = -1, secondNumber = 1, thirdNumber = 1, sumNumbers = 0;

		for (index = 1; index < 31; index++) {
			System.out.printf("\n%d", secondNumber);
			sumNumbers = secondNumber + firstNumber + thirdNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
			thirdNumber = sumNumbers;
			index = index + 1;
		}
	}

}