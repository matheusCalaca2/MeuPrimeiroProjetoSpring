package br.com.matheuscalaca.MeuPrimeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinhaPrimeraClasse {

    @GetMapping("/")
    public String meuPrimeiroMetodo(){
        return "Hello word! Matheus";
    }

}
