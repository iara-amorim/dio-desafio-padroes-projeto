package dio.bootcamp.santander.useless_facts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.bootcamp.santander.useless_facts.model.Fato;
import dio.bootcamp.santander.useless_facts.service.FatoService;

@RestController
@RequestMapping
public class FatoController {

    @Autowired
    private FatoService fatoService;

    @GetMapping("/random")
    public ResponseEntity<Fato> aleatorio() {
        Fato aleatorio = fatoService.aleatorio();
        return ResponseEntity.ok(aleatorio);
    }

    @GetMapping("/today")
    public ResponseEntity<Fato> doDia() {
        Fato today = fatoService.doDia();
        return ResponseEntity.ok(today);
    }

}
