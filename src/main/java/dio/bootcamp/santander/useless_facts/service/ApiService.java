package dio.bootcamp.santander.useless_facts.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import dio.bootcamp.santander.useless_facts.model.Fato;

@FeignClient(name = "uselessfacts", url = "https://uselessfacts.jsph.pl/")
public interface ApiService {
    @GetMapping(value = "/random.json?language=en")
    Fato fatoAleatorio();

    @GetMapping(value = "/today.json?language=en")
    Fato fatoDoDia();
}
