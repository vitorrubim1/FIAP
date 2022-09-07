package For;

public class Exercise38 {

	public static void main(String[] args) {
		int finalValue = 0, currentValue, index;
		
		for (index = 1; index < 101; index++) {
			currentValue = index;
		    finalValue = finalValue + currentValue;
		}
		
		System.out.printf("O resultado da soma no intervalo de um a cem deu: %d", finalValue);
	}

}
