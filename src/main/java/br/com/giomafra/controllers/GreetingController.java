package br.com.giomafra.controllers;

import br.com.giomafra.model.Greeting;
import com.sun.jdi.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

//abstracao de @Controller e @ResponseBody
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // para o método ser considerado http
    // http://localhost:8080?name=giovanna
    @RequestMapping("/greeting")
    public Greeting greeting(
            //para ler o parametro
            @RequestParam(value = "name", defaultValue = "Word")
            String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));

    }
}
