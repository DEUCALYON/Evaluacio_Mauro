package com.evaluacionMauro.evaluacion.service;

import java.util.List;
import java.util.Optional;

import com.evaluacionMauro.evaluacion.entity.Cliente;

public interface ClienteService {
	
	public List<Cliente> listarClientes();
	public Cliente insertarYactualizarCliente(Cliente obj);
	public Optional<Cliente> clientePorId(Long documento);
	public void eliminarCliente(Long id);
	public List<Cliente> listarClientePorNombre(String filtro);
	

}
