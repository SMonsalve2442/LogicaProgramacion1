/* Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "RUTINACAJEROMIENTRASHASTAPARA.java."

import java.io.*;

public class rutinacajeromientrashastapara {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double clave;
		int contrasenanew;
		int ndocumento;
		int opcaccion;
		int opcconsulta;
		int opctarjeta;
		double operetiro;
		int valoracumulado;
		int valorretiro;
		System.out.println("Simon Monsalve Higuita");
		System.out.println("Logica Programacion 1");
		System.out.println("601");
		System.out.println("24/02/2025");
		System.out.println("***Rutina Ciclo Cajero***");
		valoracumulado = 1000000;
		System.out.println("Señor usuario ingrese su tarjeta");
		System.out.println("1) Si");
		System.out.println("2) No");
		opctarjeta = Integer.parseInt(bufEntrada.readLine());
		if (opctarjeta!=1) {
			do {
				System.out.println("Señor usuario ingrese la tarjeta");
				opctarjeta = Integer.parseInt(bufEntrada.readLine());
			} while (opctarjeta!=1);
		}
		while (opctarjeta==1) {
			System.out.println("Señor usuario ingrese la opcion que desea ejecutar");
			System.out.println("1) Retiro");
			System.out.println("2) Consulta");
			System.out.println("3) Cambio De Clave");
			opcaccion = Integer.parseInt(bufEntrada.readLine());
			switch (opcaccion) {
			case 1:
				System.out.println("ingrese el valor que desea retirar");
				valorretiro = Integer.parseInt(bufEntrada.readLine());
				operetiro = valoracumulado-valorretiro;
				do {
					System.out.println("Señor usuario ingrese su clave (Recuerde que es de 4 digitos)");
					clave = bufEntrada.readLine();
				} while (clave<=999);
				if (operetiro<0) {
					System.out.println("Señor usuario su retiro fue erroneo. El valor ingresado es superior al valor almacenado");
				} else {
					System.out.println("Señor usuario su retiro fue exitoso aun queda en su cuenta: "+operetiro);
				}
				break;
			case 2:
				System.out.println("Señor usuario ingrese cual de las siguientes opciones desea realizar");
				System.out.println("1) Valor Neto en la tarjeta");
				System.out.println("2) Clave dinamica");
				opcconsulta = Integer.parseInt(bufEntrada.readLine());
				if (opcconsulta==1) {
					do {
						System.out.println("Señor usuario ingrese su clave (Recuerde que es de 4 digitos)");
						clave = Double.parseDouble(bufEntrada.readLine());
					} while (clave<=999);
					System.out.println("Señor usuario el valor neto de su tarjeta es de: "+valoracumulado);
				} else {
					if (opcconsulta==2) {
						do {
							System.out.println("Señor usuario ingrese su clave (Recuerde que es de 4 digitos)");
							clave = Double.parseDouble(bufEntrada.readLine());
						} while (clave<=999);
						System.out.println("Señor usuario su clave dinamica es: "+aleatorio(1000, 9999));
					}
				}
				break;
			case 3:
				System.out.println("señor usuario ingrese cual es su numero de documento: ");
				ndocumento = Integer.parseInt(bufEntrada.readLine());
				if (ndocumento<00000 || ndocumento>99999) {
					System.out.println("Señor usuario ingrese su nueva contraseña");
					contrasenanew = Integer.parseInt(bufEntrada.readLine());
				} else {
					System.out.println("Señor usuario el numero ingresado es erroneo recuerda que debe ser menor o igual a 9999 y mayor o igual a 00000 ");
				}
				break;
			default:
				System.out.println("Señor usuario el valor ingresado no esta vinculado con ningun de las posibilidades de ejecucion. Vuelva a intentarlo");
			}
			System.out.println("Desea realizar otra operacion");
			System.out.println("1) Si");
			System.out.println("2) No");
			opctarjeta = Integer.parseInt(bufEntrada.readLine());
		}
	}


}

