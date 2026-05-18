import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

void main() throws IOException, InterruptedException {
    Scanner scanner = new Scanner(System.in);
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    System.out.println("Digite o seu cep: ");
    String cep = scanner.next();

    validarCEP validarCEP = new validarCEP();

    String url = "";

    if (validarCEP.validadorCEP(cep)) {
        url = "http://viacep.com.br/ws/" + cep + "/json/";


        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        ConsultaCEPAPI consultaAPI = gson.fromJson(json, ConsultaCEPAPI.class);

        ConsultaCEP consultaCEP = new ConsultaCEP(consultaAPI);

        System.out.println(consultaCEP);

    } else {
        System.out.println("CEP inválido");
    }


}
