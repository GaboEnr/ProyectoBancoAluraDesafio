package Alura;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		String nombre = "Gabriel Enrique";
		String tipoDeCuenta = "Corriente";
		double saldo = 1599.99;
		int opcion = 0;
		
		System.out.println("**********************************************");
		System.out.println("\nNombre del Cliente: " +nombre);
		System.out.println("El tipo de cuenta es: " +tipoDeCuenta);
		System.out.println("**** Su Saldo Disponible es: " +saldo +"$  ****");
		System.out.println("\n*********************************************");
		
		String menu = """
				
				*** Escriba el numero de la operación, la cual desea realizar ***
				1 - Consultar saldo
				2 - Retirar 
				3 - Depositar 
				5 - Salir
				""";
		
		Scanner teclado = new Scanner(System.in);
		while(opcion  != 5) {
			System.out.println(menu);
			opcion = teclado.nextInt();
			
			
			switch(opcion){
				case 1:
					System.out.println("El saldo actualizado es: " + saldo + "CLP");
					break;
				case 2:
					System.out.println("Cuanto dinero desea retirar ");
					double valorRetirar = teclado.nextDouble();
					if(valorRetirar > saldo) {
						System.out.println("Saldo insuficiente");
					} else {
						saldo -= valorRetirar;
						System.out.println("el saldo actualizado es: " +saldo);
					}
					break;
				case 3:
				System.out.println("Cuanto dinero desea depositar");
				double valorDepositar = teclado.nextDouble();
				saldo += valorDepositar;
				System.out.println("el saldo actualizado es: " +saldo);
				break;
				
				case 5:
					System.out.println("Saliendo de la banca, Muchas gracias por utilizar nuestros servicios");
					break;
					
				default: 
					System.out.println("Error opcion no valida. Ingrese una opcion correcta");
				
			}
		}
	}

}
