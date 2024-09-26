package org.aplicacao.servico;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aplicacao.dto.EnderecoDto;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiServico {

    //EnderecoDto enderecoDto = new EnderecoDto();
    private EnderecoDto enderecoDto;
    public EnderecoDto getEndereco(String cep) throws IOException, InterruptedException {
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://viacep.com.br/ws/"+ cep +"/json/")).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); //Requisição deve voltar como string

            ObjectMapper mapper = new ObjectMapper();//Destrilização de json para obj java
            enderecoDto = mapper.readValue(response.body(), EnderecoDto.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    return enderecoDto;
    }
}
