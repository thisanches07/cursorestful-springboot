package com.example.cursorestfulspringboot.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Defini Classe controladora
public class ClienteController {

    List<Cliente> clientes; // declarando um vetor de clientes
    @PostConstruct
    public void init(){
       // List<Cliente> clientes; // se declarar dentro de init() ele se torna uma variavel
        Cliente c1 = new Cliente();
        c1.id = 1;
        c1.nome = "Jose";
        c1.endereco = "Rua X, 99";
        c1.saldo = 100;

        Cliente c2 = new Cliente();
        c2.id = 2;
        c2.nome = "Maria";
        c2.endereco = "Rua Y, 24";
        c2.saldo = 200;

        Cliente c3 = new Cliente();
        c3.id = 3;
        c3.nome = "Fernanda";
        c3.endereco = "Rua W, 57";
        c3.saldo = 300;

        clientes = Arrays.asList(c1,c2,c3); // pega as 3 variaveis e constroi um array em forma de lista
        System.out.println(clientes);
    }

    @GetMapping("/clientes") //Mapear
    public List<Cliente> getClientes(){ //List<Cliente> pois devolve uma lista de clientes
        
        return clientes;
    }
    @GetMapping("/clientes/{id}") //Mapear
    public Cliente getCliente(@PathVariable int id){
        Cliente cliente = null;

        //clientes.size() pega o tamanho do vetor de clientes
        /*for(int i=0; i < clientes.size();i++)
        {
            Clientes aux = clientes.get(i);
        }*/
        //ou
        for(Cliente aux : clientes) //pega do primeiro ao ultimo cliente
        {
                if(aux.id == id)
                {
                    cliente = aux;
                    break;
                }
                

        }
        return cliente;
    }
}
