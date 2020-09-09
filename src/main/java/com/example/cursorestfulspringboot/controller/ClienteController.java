package com.example.cursorestfulspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Defini Classe controladora
public class ClienteController {

    @GetMapping("/cliente") //Mapear
    public String getClientes(){
        return "Vai retornar um dia todos os clientes da BD";
    }
    @GetMapping("/cliente/{codigo}") //Mapear
    public String getClientes(@PathVariable int codigo){
        return "Vai retornar um dia o cliente de codigo " + codigo ;
    }
}
