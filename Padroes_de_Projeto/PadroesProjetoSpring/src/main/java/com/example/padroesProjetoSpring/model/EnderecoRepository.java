package com.example.padroesProjetoSpring.model;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Diego
 */

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco,String> {
}
