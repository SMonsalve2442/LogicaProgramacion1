// Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
// Es posible que el codigo generado no sea completamente correcto. Si encuentra
// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

using System;

namespace PSeInt {
	class rutinacajeromientrashastapara {

		static void Main(string[] args) {
			double clave;
			int contrasenanew;
			int ndocumento;
			int opcaccion;
			int opcconsulta;
			int opctarjeta;
			double operetiro;
			int valoracumulado;
			int valorretiro;
			Console.WriteLine("Simon Monsalve Higuita");
			Console.WriteLine("Logica Programacion 1");
			Console.WriteLine("601");
			Console.WriteLine("24/02/2025");
			Console.WriteLine("***Rutina Ciclo Cajero***");
			valoracumulado = 1000000;
			Console.WriteLine("Señor usuario ingrese su tarjeta");
			Console.WriteLine("1) Si");
			Console.WriteLine("2) No");
			opctarjeta = int.Parse(Console.ReadLine());
			if (opctarjeta!=1) {
				do {
					Console.WriteLine("Señor usuario ingrese la tarjeta");
					opctarjeta = int.Parse(Console.ReadLine());
				} while (opctarjeta!=1);
			}
			while (opctarjeta==1) {
				Console.WriteLine("Señor usuario ingrese la opcion que desea ejecutar");
				Console.WriteLine("1) Retiro");
				Console.WriteLine("2) Consulta");
				Console.WriteLine("3) Cambio De Clave");
				opcaccion = int.Parse(Console.ReadLine());
				switch (opcaccion) {
				case 1:
					Console.WriteLine("ingrese el valor que desea retirar");
					valorretiro = int.Parse(Console.ReadLine());
					operetiro = valoracumulado-valorretiro;
					do {
						Console.WriteLine("Señor usuario ingrese su clave (Recuerde que es de 4 digitos)");
						clave = Console.ReadLine();
					} while (clave<=999);
					if (operetiro<0) {
						Console.WriteLine("Señor usuario su retiro fue erroneo. El valor ingresado es superior al valor almacenado");
					} else {
						Console.WriteLine("Señor usuario su retiro fue exitoso aun queda en su cuenta: "+operetiro);
					}
					break;
				case 2:
					Console.WriteLine("Señor usuario ingrese cual de las siguientes opciones desea realizar");
					Console.WriteLine("1) Valor Neto en la tarjeta");
					Console.WriteLine("2) Clave dinamica");
					opcconsulta = int.Parse(Console.ReadLine());
					if (opcconsulta==1) {
						do {
							Console.WriteLine("Señor usuario ingrese su clave (Recuerde que es de 4 digitos)");
							clave = Double.Parse(Console.ReadLine());
						} while (clave<=999);
						Console.WriteLine("Señor usuario el valor neto de su tarjeta es de: "+valoracumulado);
					} else {
						if (opcconsulta==2) {
							do {
								Console.WriteLine("Señor usuario ingrese su clave (Recuerde que es de 4 digitos)");
								clave = Double.Parse(Console.ReadLine());
							} while (clave<=999);
							Console.WriteLine("Señor usuario su clave dinamica es: "+aleatorio(1000, 9999));
						}
					}
					break;
				case 3:
					Console.WriteLine("señor usuario ingrese cual es su numero de documento: ");
					ndocumento = int.Parse(Console.ReadLine());
					if (ndocumento<00000 || ndocumento>99999) {
						Console.WriteLine("Señor usuario ingrese su nueva contraseña");
						contrasenanew = int.Parse(Console.ReadLine());
					} else {
						Console.WriteLine("Señor usuario el numero ingresado es erroneo recuerda que debe ser menor o igual a 9999 y mayor o igual a 00000 ");
					}
					break;
				default:
					Console.WriteLine("Señor usuario el valor ingresado no esta vinculado con ningun de las posibilidades de ejecucion. Vuelva a intentarlo");
				}
				Console.WriteLine("Desea realizar otra operacion");
				Console.WriteLine("1) Si");
				Console.WriteLine("2) No");
				opctarjeta = int.Parse(Console.ReadLine());
			}
		}

	}

}

