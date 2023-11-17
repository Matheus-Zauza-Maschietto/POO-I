package br.com.unicesumar.crud.Controllers;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping
    public String principal(){
        return "Olá Mundo";
    }
}
