package program;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.http.client.ClientProtocolException;

import model.Feriado;
import service.FeriadoService;

public class ProgramaFeriado {

	public static void main(String[] args) throws ClientProtocolException, IOException {
        Scanner scanner = new Scanner(System.in);
        FeriadoService feriadoService = new FeriadoService();

        String dataDigitada;
        String dataFormatada;
        String diaDigitado;
        String mesDigitado;
        
        System.out.println("=== Identificar feriados ===");
        
        System.out.print("Informe uma data no formato dd/mm: ");
        dataDigitada = scanner.next();
        
        dataFormatada = dataDigitada.replace("/", "");
        diaDigitado = dataFormatada.substring(0, 2);
        mesDigitado = dataFormatada.substring(2, 4);
        
        List<Feriado> feriados = feriadoService.verificaFeriados();
        
        for (Feriado feriado : feriados) {
        	System.out.println(feriado.exibeFeriado(diaDigitado, mesDigitado));
        }
        
        
        scanner.close();
	}

}
