package entrada_processamento_saida;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double acceleration, speed, travelTime, kmPerHour;

		System.out.printf("Informe o valor da aceleração em m/s2: ");
		acceleration = scanner.nextDouble();

		System.out.printf("Informe o valor da velocidade inicial em m/s: ");
		speed = scanner.nextDouble();

		System.out.printf("Informe o tempo de percurso em segundos: ");
		travelTime = scanner.nextDouble();

		kmPerHour = speed + (acceleration * travelTime);

		if (kmPerHour <= 40)
			System.out.printf("Veículo muito lento");
		else if (kmPerHour > 40 && kmPerHour <= 60)
			System.out.printf("Velocidade permitida");
		else if (kmPerHour > 60 && kmPerHour <= 80)
			System.out.printf("Velocidade de cruzeiro");
		else if (kmPerHour > 80 && kmPerHour <= 120)
			System.out.printf("Veículo rápido");
		else if (kmPerHour > 120)
			System.out.printf("Veículo rápido");

		scanner.close();
	}

}
