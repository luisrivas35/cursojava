package com.edutecno.vista;


import java.util.Scanner;

import com.edutecno.util.Util;



public abstract class MenuTemplate {

	protected Scanner scan = new Scanner(System.in);

	public abstract void listarCliente();

	public abstract void agregarCliente();

	public abstract void editarCliente();

	public abstract void importarDatos();

	public abstract void exportarDatos();

	public abstract void terminarPrograma();
	
	Util util = new Util();

	public final void iniciarMenu() {
		System.out.println("1- Listar Clientes\n" + "2- Agregar Clientes\n" + "3- Editar Clientes\n"
				+ "4- Cargar Datos\n" + "5- Exportar Datos\n" + "6- Salir del Sistema");

		System.out.print("Indique su Opcion: ");
		int opcion = scan.nextInt();

		switch (opcion) {
		case 1:
			listarCliente();
			break;
		case 2:
			agregarCliente();
			break;
		case 3:
			editarCliente();
			break;
		case 4:
			importarDatos();
			break;
		case 5:
			exportarDatos();
			break;
		case 6:
			terminarPrograma();
			break;
		default:
			System.out.println("La opcion no es valida...");
		}
		util.limpiarPantalla();
		iniciarMenu();
		
	}
	
}
