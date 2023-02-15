package service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import model.Coins;

public class Converter {

	public Coins converterCoins(int option) throws ClientProtocolException, IOException {

		Coins coins = null;

		HttpGet request = null;

		String params = "";
	
		if (option == 1) params = "USD-BRL";
		if (option == 2) params = "EUR-BRL";
		if (option == 3) params = "BTC-BRL";
		
		if (params != null) {
			request = new HttpGet("https://economia.awesomeapi.com.br/json/last/"+params);
		}

		try (CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

				CloseableHttpResponse response = httpClient.execute(request)) {
			HttpEntity entity = response.getEntity();
			
			if (entity != null) {
				String result = EntityUtils.toString(entity);
				
				Gson gson = new Gson();
				JsonElement element = gson.fromJson(result, JsonElement.class);

				String paramsFormated = params.replace("-", "");
			
				System.out.println("Valor do objeto: " + paramsFormated);
				
				// obter objeto USDBRL
				JsonObject usdBrlObj = element.getAsJsonObject().get(paramsFormated).getAsJsonObject();

				System.out.println("Valor do objeto: " + usdBrlObj);

				gson.fromJson(usdBrlObj, Coins.class);
			}
		}

		return coins;
	}
}
