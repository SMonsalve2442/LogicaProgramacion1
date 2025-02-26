/* Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJERCICIOSUMA.java."

import java.io.*;

public class ejerciciosuma {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		int c;
		System.out.println("Ingrese el numero que desea asignar a A: ");
		a = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el numero que desea asignar a B: ");
		b = Integer.parseInt(bufEntrada.readLine());
		c = a+b;
		System.out.println("La suma es: "+c);
	}


}

