package br.com.digidex.service;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import br.com.digidex.model.Digimon;

@Service
public class DigimonService {
	
	public Digimon encontrarDigimonPorNome(String name) {
		Digimon digimon = null;
		
		name = name.replace(" ", "%20");
		
		HttpGet request = new HttpGet("https://www.digi-api.com/api/v1/digimon/" + name);
		try(CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
				CloseableHttpResponse response = httpClient.execute(request)) {
			
			HttpEntity entity = response.getEntity();
			
			if (entity != null) {
				String result = EntityUtils.toString(entity);
				Gson gson = new Gson();
				digimon = gson.fromJson(result, Digimon.class);
			}
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return digimon;
	}
}
