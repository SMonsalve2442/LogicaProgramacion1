// Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
// Es posible que el codigo generado no sea completamente correcto. Si encuentra
// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

using System;

namespace PSeInt {
	class ciclopara {

		static void Main(string[] args) {
			int resencendido;
			int resrepetimiento;
			int restemperatura;
			int restemperaturadeseada;
			int suma;
			Console.WriteLine("Simon Monsalve Higuita");
			Console.WriteLine("Logica Programacion 1");
			Console.WriteLine("601");
			Console.WriteLine("24/02/2025");
			Console.WriteLine("***Rutina Ciclo Para Aire Acondicionado***");
			Console.WriteLine("Señor usuario desea encender el aire acondicionado?");
			Console.WriteLine("1) Si");
			Console.WriteLine("2) No");
			resencendido = int.Parse(Console.ReadLine());
			if (resencendido==1) {
				resrepetimiento = 1;
				while (resrepetimiento==1) {
					Console.WriteLine("Ingerese la temperatura en la que se encuentra el aire");
					restemperatura = int.Parse(Console.ReadLine());
					Console.WriteLine("Ingrese la temperatura que desea que se establesca el aire");
					restemperaturadeseada = int.Parse(Console.ReadLine());
					if (restemperaturadeseada<=20 || restemperaturadeseada>=50) {
						Console.WriteLine("La temperatura que deseas no esta en el rango disponible en este aire");
					} else {
						if (restemperatura<restemperaturadeseada) {
							for (restemperatura=restemperatura; restemperatura<=restemperaturadeseada; ++restemperatura) {
								Console.WriteLine("El aire acondicionado se encuentra en "+restemperatura+" y esta incrementando hasta: "+restemperaturadeseada);
								suma = 1;
							}
						} else {
							if (restemperatura>restemperaturadeseada) {
								for (restemperatura=restemperatura; restemperatura>=restemperaturadeseada; --restemperatura) {
									Console.WriteLine("El aire acondicionado se encuentra en "+restemperatura+" y esta disminuyendo hasta: "+restemperaturadeseada);
									suma = 2;
								}
							}
						}
						if (suma==1) {
							Console.WriteLine("La temperatura actual es: "+restemperatura-1);
						} else {
							Console.WriteLine("La temperatura actual es: "+restemperatura+1);
						}
					}
					Console.WriteLine("Señor usuario desea hacer otro cambio en la temperatura del aire: ");
					Console.WriteLine("1) Si");
					Console.WriteLine("2) No");
					resrepetimiento = int.Parse(Console.ReadLine());
				}
			} else {
				Console.WriteLine("Señor usuario su eleccion fue 2 es decir que no desea prender el aire");
			}
		}

	}

}

