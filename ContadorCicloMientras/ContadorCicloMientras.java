/* Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CONTADORCICLOMIENTRAS.java."

import java.io.*;

public class contadorciclomientras {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cont;
		int limite;
		String mensaje;
		String nombre;
		System.out.println("Simon Monsalve Higuita");
		System.out.println("Logica Programacion 1");
		System.out.println("601");
		System.out.println("17/02/2025");
		System.out.println("***Contador ciclo mientras***");
		System.out.println("Ingrese su nombre");
		nombre = bufEntrada.readLine();
		System.out.println("Ingresa el numero de impresiones");
		limite = Integer.parseInt(bufEntrada.readLine());
		cont = 0;
		mensaje = "Hola ";
		while (cont<=limite) {
			System.out.println("Hola "+nombre+" tu contador es: "+cont);
			cont = cont+1;
		}
	}


}

