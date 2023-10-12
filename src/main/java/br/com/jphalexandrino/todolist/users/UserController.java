package br.com.jphalexandrino.todolist.users;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Modificador
 * Public
 * Private
 * Protected
 */
@RestController
@RequestMapping("/users")
public class UserController {
    /*
     * String (texto)
     * Integer (int) - Numeros inteiros
     * Double (double) - Numeros com virgula Exemplo: 0.0000
     * Float (float) - Igual ao "Double" mas, com mais cartacteres
     * Char (A C ) - Aceita caracteres
     * Date (dada)
     * Void
     */
    /*
     * Body
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.name);
    }
    
}
