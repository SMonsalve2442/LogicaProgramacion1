/* Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CALCULADORA.java."

import java.io.*;

public class calculadora {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int operacion;
		int valora;
		int valorb;
		double valorc;
		System.out.println("Ingrese el valor del primer numero: ");
		valora = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el valor del segundo numero: ");
		valorb = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Digite el numero de la operacion que desea hacer: ");
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) Multiplicacion");
		System.out.println("4) Division");
		operacion = Integer.parseInt(bufEntrada.readLine());
		if (operacion==1) {
			valorc = valora+valorb;
			System.out.println("El valor de la operacion Suma es: "+valorc);
		} else {
			if (operacion==2) {
				valorc = valora-valorb;
				System.out.println("El valor de la operacion Resta es: "+valorc);
			} else {
				if (operacion==3) {
					valorc = valora*valorb;
					System.out.println("El valor de la operacion Multiplicacion es: "+valorc);
				} else {
					if (operacion==4) {
						if (valorb==0) {
							System.out.println("El valor ingresado en el segundo valor es erroneo. Prueba nuevamente");
						} else {
							valorc = valora/valorb;
							System.out.println("El valor de la operacion Division es: "+valorc);
						}
					} else {
						System.out.println("El numero ingresado en el menu de la operacion no corresponde a ninguna de las opciones. Prueba nuevamente");
					}
				}
			}
		}
	}


}

