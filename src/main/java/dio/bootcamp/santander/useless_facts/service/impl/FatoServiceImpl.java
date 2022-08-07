package dio.bootcamp.santander.useless_facts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.bootcamp.santander.useless_facts.model.Fato;
import dio.bootcamp.santander.useless_facts.service.ApiService;
import dio.bootcamp.santander.useless_facts.service.FatoService;

@Service
public class FatoServiceImpl implements FatoService {

    @Autowired
    private ApiService apiService;

    @Override
    public Fato aleatorio() {
        return apiService.fatoAleatorio();
    }

    @Override
    public Fato doDia() {
        return apiService.fatoDoDia();
    }

}
