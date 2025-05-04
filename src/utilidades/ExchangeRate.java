package utilidades;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ExchangeRate {
    @SerializedName("conversion_rates")
    private Map<String, Double> rates;

    public ExchangeRate() {
    }

    public ExchangeRate(Map<String, Double> rates) {
        this.rates = rates;
    }

    public String getRates(String moeda,String moedaConvertida,Double valorParaConversao) {
        URI link = URI.create("https://v6.exchangerate-api.com/v6/af32518182f8a57ee19c12a4/latest/" + moeda);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .GET()
                .build();

        try {

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            DadosDTO dto = gson.fromJson(json, DadosDTO.class);
            rates = dto.conversion_rates();
            double moedaDois = rates.get(moedaConvertida);
            double conversao = valorParaConversao * moedaDois;
            String formatado = String.format("%.2f", conversao);
            return formatado;

        } catch (IOException |InterruptedException e) {
            throw new RuntimeException("Aconteceu um erro na requisição. Tente novamente");
        }
    }

}
