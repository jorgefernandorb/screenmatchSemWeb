package br.com.tjSpring.screenmatch;

import br.com.tjSpring.screenmatch.model.DadosSerie;
import br.com.tjSpring.screenmatch.service.ConsumoApi;
import br.com.tjSpring.screenmatch.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();	//pode ser usado um var (por inferência) no lugar da 1º chamada de classe ConsumoApi
//		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&Season=1&apikey=6585022c");
//		System.out.println(json);
//		json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
//		System.out.println(json);
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);
		ConverterDados converterDados = new ConverterDados();
		DadosSerie dadosSerie = converterDados.obterDados(json, DadosSerie.class);
		System.out.println(dadosSerie);
	}
}
