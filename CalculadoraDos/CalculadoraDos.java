/* Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CALCULADORADOS.java."

import java.io.*;

public class calculadorados {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String operacion;
		int valora;
		int valorb;
		double valorc;
		System.out.println("***Calculadora Pos***");
		System.out.println("Ingrese el primer numero: ");
		valora = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el segundo numero: ");
		valorb = Integer.parseInt(bufEntrada.readLine());
		if (valora==0 && valorb==0) {
			System.out.println("Los valores ingresados daran como resultado 0 sin importar la operacion que deseas realizar");
		} else {
			System.out.println("Ingrese de manera escrita cual de las operaciones desea realizar (suma/resta/multiplicacion/division)");
			operacion = bufEntrada.readLine();
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
		}
	}


}

