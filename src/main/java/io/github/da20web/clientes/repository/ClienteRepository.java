package io.github.da20web.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.da20web.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
