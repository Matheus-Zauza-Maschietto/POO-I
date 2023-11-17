package br.com.unicesumar.crud.Controllers;

import br.com.unicesumar.crud.Model.Pessoa;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    private List<Pessoa> mock(){
        return Arrays.asList(new Pessoa(1,"troxa", "tralala"),
                             new Pessoa(2,"maluco", "trululu"),
                             new Pessoa(3,"babaca", "trololo"),
                             new Pessoa(4,"besta", "trilili"));

    }

    @PostMapping
    public String postPessoa(){
        return "lixo";
    }

    @GetMapping
    public List<Pessoa> getAll(){
        return mock();
    }

    @GetMapping("/{id}")
    public Pessoa getById(@PathVariable long id){
        return mock().stream().filter(pessoa -> pessoa.getId() == id).findFirst().orElse(null);
    }

    @GetMapping("/pesquisa")
    public Pessoa getByNome(@RequestParam("search") String nome){
        return mock().stream().filter(pessoa -> pessoa.getNome().toLowerCase().contains(nome.toLowerCase())).findFirst().orElse(null);
    }

    @PutMapping
    public String putPessoa(){
        return "lixo";
    }

    @PatchMapping
    public String patchPessoa(){
        return "lixo";
    }
}
