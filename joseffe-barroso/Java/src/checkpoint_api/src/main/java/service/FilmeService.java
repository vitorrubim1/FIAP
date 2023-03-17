package service;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import model.Comentario;
import model.Filme;

public class FilmeService {

    public HashMap<Integer, Filme> getFilmes() throws ClientProtocolException, IOException {

        HashMap<Integer, Filme> filmes = new HashMap<Integer, Filme>();

        HttpGet request = new HttpGet("https://sujeitoprogramador.com/r-api/?api=filmes");

        try (CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
                CloseableHttpResponse response = httpClient.execute(request)) {

            HttpEntity entity = response.getEntity();

            if (entity != null) {
                String result = EntityUtils.toString(entity);

                Gson gson = new Gson();

                Filme[] filmesArray = gson.fromJson(result, Filme[].class);

                // Adiciona uma lista vazia de comentários para cada filme
                for (Filme f : filmesArray) {
                    f.setComentarios(new HashMap<Integer, Comentario>());
                    filmes.put(f.getId(), f);
                }
            }
        }

        return filmes;
    }
}
