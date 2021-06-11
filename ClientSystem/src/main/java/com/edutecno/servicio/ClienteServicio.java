package com.edutecno.servicio;

import java.util.List;


import com.edutecno.modelo.Cliente;

public interface ClienteServicio {
	
	public void agregarCliente(Cliente cliente);
	
	public void editarCliente(Cliente cliente);
	
	public List<Cliente> listarCliente();

}
