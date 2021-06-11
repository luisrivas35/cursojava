package com.edutecno.servicio;

import java.util.ArrayList;
import java.util.List;


import com.edutecno.modelo.Cliente;

public class ClienteServicioImp implements ClienteServicio {
	
	private List<Cliente> listaClientes = new ArrayList<Cliente>();

	@Override
	public void agregarCliente(Cliente cliente) {
		if (cliente != null) {
			
			listaClientes.add(cliente);
		}

	}

	@Override
	public void editarCliente(Cliente cliente) {
		for ( Cliente client : listaClientes) {
					
			if (listaClientes.contains(client.getRunCliente())){
				
				
			}else {
				System.out.println("Cliente no Existe........");
			}
		}

	}

	@Override
	public List<Cliente> listarCliente() {
		
		return listaClientes;
	}

}
