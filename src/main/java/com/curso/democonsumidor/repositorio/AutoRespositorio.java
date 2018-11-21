package com.curso.democonsumidor.repositorio;

import com.curso.democonsumidor.entidades.Auto;
import org.springframework.data.repository.CrudRepository;

public interface AutoRespositorio extends CrudRepository<Auto, Long>
{
}
