package com.example.padroesProjetoSpring.service;


import com.example.padroesProjetoSpring.model.Cliente;

/**
 * @author Diego
 */
public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
