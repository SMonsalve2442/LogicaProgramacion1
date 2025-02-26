/* Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CICLOPARA.java."

import java.io.*;

public class ciclopara {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int resencendido;
		int resrepetimiento;
		int restemperatura;
		int restemperaturadeseada;
		int suma;
		System.out.println("Simon Monsalve Higuita");
		System.out.println("Logica Programacion 1");
		System.out.println("601");
		System.out.println("24/02/2025");
		System.out.println("***Rutina Ciclo Para Aire Acondicionado***");
		System.out.println("Señor usuario desea encender el aire acondicionado?");
		System.out.println("1) Si");
		System.out.println("2) No");
		resencendido = Integer.parseInt(bufEntrada.readLine());
		if (resencendido==1) {
			resrepetimiento = 1;
			while (resrepetimiento==1) {
				System.out.println("Ingerese la temperatura en la que se encuentra el aire");
				restemperatura = Integer.parseInt(bufEntrada.readLine());
				System.out.println("Ingrese la temperatura que desea que se establesca el aire");
				restemperaturadeseada = Integer.parseInt(bufEntrada.readLine());
				if (restemperaturadeseada<=20 || restemperaturadeseada>=50) {
					System.out.println("La temperatura que deseas no esta en el rango disponible en este aire");
				} else {
					if (restemperatura<restemperaturadeseada) {
						for (restemperatura=restemperatura; restemperatura<=restemperaturadeseada; ++restemperatura) {
							System.out.println("El aire acondicionado se encuentra en "+restemperatura+" y esta incrementando hasta: "+restemperaturadeseada);
							suma = 1;
						}
					} else {
						if (restemperatura>restemperaturadeseada) {
							for (restemperatura=restemperatura; restemperatura>=restemperaturadeseada; --restemperatura) {
								System.out.println("El aire acondicionado se encuentra en "+restemperatura+" y esta disminuyendo hasta: "+restemperaturadeseada);
								suma = 2;
							}
						}
					}
					if (suma==1) {
						System.out.println("La temperatura actual es: "+restemperatura-1);
					} else {
						System.out.println("La temperatura actual es: "+restemperatura+1);
					}
				}
				System.out.println("Señor usuario desea hacer otro cambio en la temperatura del aire: ");
				System.out.println("1) Si");
				System.out.println("2) No");
				resrepetimiento = Integer.parseInt(bufEntrada.readLine());
			}
		} else {
			System.out.println("Señor usuario su eleccion fue 2 es decir que no desea prender el aire");
		}
	}


}

