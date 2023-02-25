package program;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.apache.http.client.ClientProtocolException;

import service.DominioService;

public class Programa {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
			
		String nomeDominio;
		String retorno = "";
		String dataFormatada="";
		
		System.out.print("Digite um nome de domínio para verificar a disponibilidade: ");
		nomeDominio = ler.next();
		
		DominioService dominioService = new DominioService();
		
		retorno = dominioService.verificaDisponibilidadeDominio(nomeDominio);
		
		if (retorno == "")
			System.out.print("Domínio " + nomeDominio + " disponível!");
		else {
			dataFormatada = retorno.substring(8, 10) + "/" + retorno.substring(5, 7) + "/" + retorno.substring(0, 4);
			System.out.print("Domínio " + nomeDominio + " já utilizado, porém expira em: " + dataFormatada);
		}
	}
}