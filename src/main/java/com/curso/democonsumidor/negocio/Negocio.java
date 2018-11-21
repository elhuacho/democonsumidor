package com.curso.democonsumidor.negocio;

import com.curso.democonsumidor.entidades.Auto;
import com.curso.democonsumidor.repositorio.AutoRespositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Negocio {

    @Autowired
    private AutoRespositorio autoRespositorio;

    public Auto grabar(Auto auto){
        return autoRespositorio.save(auto);
    }

}
