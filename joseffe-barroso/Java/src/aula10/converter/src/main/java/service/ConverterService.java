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
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import model.Coins;

public class ConverterService {
	public Coins getCoinResult(int option) throws ClientProtocolException, IOException {
	       
		Coins coin = null;
        String params = "";
        
        if (option == 1) params = "USD-BRL";
        if (option == 2) params = "EUR-BRL";
        if (option == 3) params = "BTC-BRL";
       
        HttpGet request = new HttpGet("https://economia.awesomeapi.com.br/json/last/"+params);

		try(CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
               
            CloseableHttpResponse response = httpClient.execute(request)) {
           
            HttpEntity entity = response.getEntity();
           
            if(entity != null) {
            	String parsedParams = params.replace("-", "");
            	String result = EntityUtils.toString(entity);
            	
                Gson gson = new Gson();
                JsonObject responseJson = gson.fromJson(result, JsonObject.class);
                JsonElement element = responseJson.get(parsedParams);

                coin = gson.fromJson(element, Coins.class);
            }
        }
       
        return coin;
    }
}
