package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.Api;
import java.io.IOException;
import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

public class AluguelTest{
    @Test
    public void desconto_10_limite1() throws IOException {
        Api rec = new Api();
        //Instanciando a lib gson que transforma a resposta que vem como json
        Gson gson = new Gson();

        //Especificando a URL da API Aluguel
        String response = rec.run("https://aluguebug.herokuapp.com/calc?dados={%22valor_nominal%22:4000,%22dia%22:1}");

        //Transforma a resposta json para string
        String obj = gson.fromJson(response, String.class);

        //Usando a Lib JsonObject eu instancio a string Obj que foi pega na requisição
        JSONObject Valor = new JSONObject(obj);

        //Pego somente o valor dado na resposta da api
        int Valor_calculado = Valor.getInt("valor_calculado");

        //Printa o valor na qual foi coletado na resposta da api
        assertEquals(3600, Valor_calculado);
    }

    @Test
    public void desconto_10_limite5() throws IOException {
        Api rec = new Api();
        //Instanciando a lib gson que transforma a resposta que vem como json
        Gson gson = new Gson();

        //Especificando a URL da API Aluguel
        String response = rec.run("https://aluguebug.herokuapp.com/calc?dados={%22valor_nominal%22:4000,%22dia%22:5}");

        //Transforma a resposta json para string
        String obj = gson.fromJson(response, String.class);

        //Usando a Lib JsonObject eu instancio a string Obj que foi pega na requisição
        JSONObject Valor = new JSONObject(obj);

        //Pego somente o valor dado na resposta da api
        int Valor_calculado = Valor.getInt("valor_calculado");

        //Printa o valor na qual foi coletado na resposta da api
        assertEquals(3600, Valor_calculado);
    }

    @Test
    public void desconto_5_limite6() throws IOException {
        Api rec = new Api();
        //Instanciando a lib gson que transforma a resposta que vem como json
        Gson gson = new Gson();

        //Especificando a URL da API Aluguel
        String response = rec.run("https://aluguebug.herokuapp.com/calc?dados={%22valor_nominal%22:4000,%22dia%22:6}");

        //Transforma a resposta json para string
        String obj = gson.fromJson(response, String.class);

        //Usando a Lib JsonObject eu instancio a string Obj que foi pega na requisição
        JSONObject Valor = new JSONObject(obj);

        //Pego somente o valor dado na resposta da api
        int Valor_calculado = Valor.getInt("valor_calculado");

        //Printa o valor na qual foi coletado na resposta da api
        assertEquals(3800, Valor_calculado);
    }

    @Test
    public void desconto_5_limite10() throws IOException {
        Api rec = new Api();
        //Instanciando a lib gson que transforma a resposta que vem como json
        Gson gson = new Gson();

        //Especificando a URL da API Aluguel
        String response = rec.run("https://aluguebug.herokuapp.com/calc?dados={%22valor_nominal%22:4000,%22dia%22:10}");

        //Transforma a resposta json para string
        String obj = gson.fromJson(response, String.class);

        //Usando a Lib JsonObject eu instancio a string Obj que foi pega na requisição
        JSONObject Valor = new JSONObject(obj);

        //Pego somente o valor dado na resposta da api
        int Valor_calculado = Valor.getInt("valor_calculado");
        
        //Printa o valor na qual foi coletado na resposta da api
        assertEquals(3800, Valor_calculado);
    }

    @Test
    public void sameValue_limite11() throws IOException {
        Api rec = new Api();
        //Instanciando a lib gson que transforma a resposta que vem como json
        Gson gson = new Gson();

        //Especificando a URL da API Aluguel
        String response = rec.run("https://aluguebug.herokuapp.com/calc?dados={%22valor_nominal%22:4000,%22dia%22:11}");

        //Transforma a resposta json para string
        String obj = gson.fromJson(response, String.class);

        //Usando a Lib JsonObject eu instancio a string Obj que foi pega na requisição
        JSONObject Valor = new JSONObject(obj);

        //Pego somente o valor dado na resposta da api
        int Valor_calculado = Valor.getInt("valor_calculado");

        //Printa o valor na qual foi coletado na resposta da api
        assertEquals(4000, Valor_calculado);
    }

    @Test
    public void sameValue_limite15() throws IOException {
        Api rec = new Api();
        //Instanciando a lib gson que transforma a resposta que vem como json
        Gson gson = new Gson();

        //Especificando a URL da API Aluguel
        String response = rec.run("https://aluguebug.herokuapp.com/calc?dados={%22valor_nominal%22:4000,%22dia%22:15}");

        //Transforma a resposta json para string
        String obj = gson.fromJson(response, String.class);

        //Usando a Lib JsonObject eu instancio a string Obj que foi pega na requisição
        JSONObject Valor = new JSONObject(obj);

        //Pego somente o valor dado na resposta da api
        int Valor_calculado = Valor.getInt("valor_calculado");

        //Printa o valor na qual foi coletado na resposta da api
        assertEquals(4000, Valor_calculado);
    }


    @Test
    public void multa_limite16() throws IOException {
        Api rec = new Api();
        //Instanciando a lib gson que transforma a resposta que vem como json
        Gson gson = new Gson();

        //Especificando a URL da API Aluguel
        String response = rec.run("https://aluguebug.herokuapp.com/calc?dados={%22valor_nominal%22:4000,%22dia%22:16}");

        //Transforma a resposta json para string
        String obj = gson.fromJson(response, String.class);

        //Usando a Lib JsonObject eu instancio a string Obj que foi pega na requisição
        JSONObject Valor = new JSONObject(obj);

        //Pego somente o valor dado na resposta da api
        int Valor_calculado = Valor.getInt("valor_calculado");

        //Printa o valor na qual foi coletado na resposta da api
        assertEquals(4084, Valor_calculado);
    }

    @Test
    public void multa_limite30() throws IOException {
        Api rec = new Api();
        //Instanciando a lib gson que transforma a resposta que vem como json
        Gson gson = new Gson();

        //Especificando a URL da API Aluguel
        String response = rec.run("https://aluguebug.herokuapp.com/calc?dados={%22valor_nominal%22:4000,%22dia%22:30}");

        //Transforma a resposta json para string
        String obj = gson.fromJson(response, String.class);

        //Usando a Lib JsonObject eu instancio a string Obj que foi pega na requisição
        JSONObject Valor = new JSONObject(obj);

        //Pego somente o valor dado na resposta da api
        int Valor_calculado = Valor.getInt("valor_calculado");

        //Printa o valor na qual foi coletado na resposta da api
        assertEquals(4140, Valor_calculado);
    }
}