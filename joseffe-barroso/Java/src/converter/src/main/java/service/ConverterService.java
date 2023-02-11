package service;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import com.google.gson.Gson;

import model.Coin;

public class ConverterService {
	public Coin getCoinResult(int option) throws ClientProtocolException, IOException {
	       
		Coin coin = null;
        
        HttpGet request = null;
        
        if (option == 1) request = new HttpGet("https://economia.awesomeapi.com.br/json/last/USD-BRL");
        if (option == 2) request = new HttpGet("https://economia.awesomeapi.com.br/json/last/EUR-BRL");
        if (option == 3) request = new HttpGet("https://economia.awesomeapi.com.br/json/last/BTC-BRL");
       

		try(CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
               
            CloseableHttpResponse response = httpClient.execute(request)) {
           
            HttpEntity entity = response.getEntity();
           
            if(entity != null) {
            	String result = EntityUtils.toString(entity);
               
                Gson gson = new Gson();
               
                coin = gson.fromJson(result, Coin.class);
            }
        }
       
        return coin;
    }
}
