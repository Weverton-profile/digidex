package br.com.digidex;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;

import br.com.digidex.model.DigEv;
import br.com.digidex.model.Digimon;

@SpringBootApplication
public class DigidexApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigidexApplication.class, args);
		
		Digimon digimon = null;
		
		HttpGet request = new HttpGet("https://www.digi-api.com/api/v1/digimon/shroudmon");
		try(CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
				CloseableHttpResponse response = httpClient.execute(request)) {
			
			HttpEntity entity = response.getEntity();
			
			if (entity != null) {
				String result = EntityUtils.toString(entity);
				System.out.println(result);
				Gson gson = new Gson();
				digimon = gson.fromJson(result, Digimon.class);
				System.out.println(digimon.getName());
				System.out.println(digimon.isxAntibody());
				System.out.println(digimon.getImages());
				System.out.println(digimon.getLevels());
				System.out.println(digimon.getTypes());
				System.out.println(digimon.getAttributes());
				System.out.println(digimon.getFields());
				System.out.println(digimon.getSkills());
				System.out.println("Prior Evolutions:");
				for (DigEv priorEv : digimon.getPriorEvolutions()) {
					System.out.println(priorEv.getDigimon());
					System.out.println(priorEv.getCondition());
				}
				System.out.println("Next Evolutions:");
				for (DigEv nextEv : digimon.getNextEvolutions()) {
					System.out.println(nextEv.getDigimon());
					System.out.println(nextEv.getCondition());
				}
			}
			
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
