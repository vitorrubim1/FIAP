package service;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import model.Feriado;

public class FeriadoService {
    
    public ArrayList<Feriado> verificaFeriados() throws ClientProtocolException, IOException {
        
        ArrayList<Feriado> feriados = null;
            
        HttpGet request = new HttpGet("https://brasilapi.com.br/api/feriados/v1/2023");
        
        try(CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
                
                CloseableHttpResponse response = httpClient.execute(request)) {
            
            HttpEntity entity = response.getEntity();
            
            if(entity != null) {
                
                String result = EntityUtils.toString(entity);
                
                Gson gson = new Gson();
                TypeToken<ArrayList<Feriado>> typeToken = new TypeToken<ArrayList<Feriado>>() {};
                feriados = gson.fromJson(result, typeToken.getType());
            }
        }   
        
        return feriados;
    }
}
