package br.com.jphalexandrino.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/primeiraRota ---- 
public class MinhaPrimeiraController {

    /**
     * Métodos de acesso do HTTP
     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/informação
     * DELETE - Remover u dado
     * PATCH - Aleterar somente uma parte da informação/dado
     */

     // Método (Funcionalidade) de uma classe
     @GetMapping("/primeiroMetodo")
    public String primeiraMensagem(){
        return "Olá, mundo! Abacate";
    }
    
}
