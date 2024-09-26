package org.aplicacao;

import org.aplicacao.dto.EnderecoDto;
import org.aplicacao.servico.ApiServico;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        ApiServico apiServico = new ApiServico();

        EnderecoDto enderecoDto = apiServico.getEndereco("01001000");
        System.out.println(enderecoDto.getLogradouro());
        System.out.println(enderecoDto.getBairro());
        System.out.println(enderecoDto.getUf());
        System.out.println(enderecoDto.getIbge());

    }
}

