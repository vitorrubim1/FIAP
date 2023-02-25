package service;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class DominioService {
	public String verificaDisponibilidadeDominio(String nome) throws ClientProtocolException, IOException {
		
		String expiracao = "";
		
		HttpGet request = new HttpGet("https://brasilapi.com.br/api/registrobr/v1/" + nome);
			
		try(CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
				
				CloseableHttpResponse response = httpClient.execute(request)) {
			
			HttpEntity entity = response.getEntity();
			
			if(entity != null) {
				
				String result = EntityUtils.toString(entity);

				JSONObject payload = new JSONObject(result);
				
				if (payload.has("expires-at")) 
					expiracao = payload.get("expires-at").toString();
				else
					expiracao = "";
			}
		}
		
		return expiracao;
	}
}