/* Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CALCULADORATRES.java."

import java.io.*;

public class calculadoratres {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String operacion;
		int valora;
		int valorb;
		double valorc;
		System.out.println("***Calculadora in***");
		System.out.println("Ingrese el primer numero: ");
		valora = Integer.parseInt(bufEntrada.readLine());
		if (valora==0 || valora!=0) {
			System.out.println("Ingrese de manera escrita cual de las operaciones desea realizar (suma/resta/multiplicacion/division)");
			operacion = bufEntrada.readLine();
			// Validacion de operacion posible
			if (operacion.equals("suma") || operacion.equals("resta") || operacion.equals("multiplicacion") || operacion.equals("division")) {
				System.out.println("Ingrese el segundo numero: ");
				valorb = Integer.parseInt(bufEntrada.readLine());
				if (operacion.equals("suma")) {
					valorc = valora+valorb;
					System.out.println("El resultado de la suma es: "+valorc);
				} else {
					if (operacion.equals("resta")) {
						valorc = valora-valorb;
						System.out.println("El resultado de la resta es: "+valorc);
					} else {
						if (operacion.equals("multiplicacion")) {
							valorc = valora*valorb;
							System.out.println("El resultado de la multiplicacion es: "+valorc);
						} else {
							if (operacion.equals("division")) {
								if (valorb!=0) {
									valorc = valora/valorb;
									System.out.println("El resultado de la division es: "+valorc);
								} else {
									System.out.println("El valor asignado al divisor es erroneo no se puede dividir por cero");
								}
							}
						}
					}
				}
			} else {
				System.out.println("La operacion ingresada no esta disponible");
			}
		} else {
			System.out.println("El dato ingresado en el campo del ingreso del primer numero es erroneo");
		}
	}


}

