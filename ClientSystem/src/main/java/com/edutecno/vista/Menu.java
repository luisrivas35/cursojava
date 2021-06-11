package com.edutecno.vista;


import java.util.Scanner;


import com.edutecno.modelo.Cliente;
import com.edutecno.servicio.ClienteServicio;
import com.edutecno.servicio.ClienteServicioImp;
import com.edutecno.util.Util;

public class Menu extends MenuTemplate{
	
	private Util util;
	private ClienteServicio clienteServicio = new ClienteServicioImp();
	
		
	//private ArchivoServicio archivoServicio;
	//private ExportarCsv exportadorCsv;
	//private ExportarTxt exportadorTxt;
	private String fileName = "Clientes";
	private String fileName1 = "DBClientes.csv";

	@Override
	public void listarCliente() {
		clienteServicio.listarCliente().forEach(entry -> {
			//Cliente cliente = entry.
		});
		
	}

	@Override
	public void agregarCliente() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nIngrese RUN del Cliente: ");
		String id = sc.nextLine();
		System.out.print("\nIngrese Nombre del Cliente: ");
		String name = sc.nextLine();
		System.out.print("\nIngrese Apellido del Cliente: "); 
		String ape = sc.nextLine();
		System.out.print("\nIngrese Años como Cliente: ");
		String year = sc.nextLine();
		
		
		Cliente cliente = new Cliente(id, name, ape, year, null);
		clienteServicio.agregarCliente(cliente);
		util.printLine("Cliente Ingresado..................");
		sc.close();
	}

	@Override
	public void editarCliente() {
		
		System.out.println("----------Editar Cliente----------");
		System.out.print("\n1- Cambiar estado del Cliente: ");
		System.out.print("\n2- Editar los Datos del Cliente: ");
		System.out.print("Indique su Opcion: ");
		int opcion = scan.nextInt();

		switch (opcion) {
		case 1:
		//	changeStateClient();
			break;
		case 2:
			//editClient();
			
			break;	
		default:
			System.out.println("La opcion no es valida...");
		}
		
		
	}

	@Override
	public void importarDatos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exportarDatos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void terminarPrograma() {
		// TODO Auto-generated method stub
		
	}

	
}
