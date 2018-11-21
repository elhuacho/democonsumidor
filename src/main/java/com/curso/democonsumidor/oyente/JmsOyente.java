package com.curso.democonsumidor.oyente;

import com.curso.democonsumidor.entidades.Auto;
import com.curso.democonsumidor.negocio.Negocio;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsOyente {

    @Autowired
    private Negocio negocio;

    @JmsListener(destination = "${jms.colita.leer}")
    public void mensajeria(String mensaje) {
        System.out.println("Leído: " + mensaje);
        ObjectMapper mapper = new ObjectMapper();
        try {
            Auto auto = mapper.readValue(mensaje, Auto.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
