package app;
import model.Api;
import java.io.IOException;
import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

public class Aplicacao{
    public static void main(String [] args)throws IOException {
        //Instanciando a API
        Api rec = new Api();
        //Instanciando a lib gson que transforma a resposta que vem como json
        Gson gson = new Gson();

        //Especificando a URL da API Aluguel
        String response = rec.run("https://aluguebug.herokuapp.com/calc?dados={%22valor_nominal%22:2000,%22dia%22:6}");

        //Transforma a resposta json para string
        String obj = gson.fromJson(response, String.class);

        //Usando a Lib JsonObject eu instancio a string Obj que foi pega na requisição
        JSONObject Valor = new JSONObject(obj);

        //Pego somente o valor dado na resposta da api
        Integer Valor_calculado = Valor.getInt("valor_calculado");

        //Printa o valor na qual foi coletado na resposta da api
        System.out.println(Valor_calculado);

    }
}