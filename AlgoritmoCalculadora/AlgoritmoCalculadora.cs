// Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
// Es posible que el codigo generado no sea completamente correcto. Si encuentra
// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

using System;

namespace PSeInt {
	class algoritmocalculadora {

		static void Main(string[] args) {
			string continuar;
			int operacion;
			int valora;
			int valorb;
			double valorc;
			Console.WriteLine("Ingrese el valor del primer numero: ");
			valora = int.Parse(Console.ReadLine());
			Console.WriteLine("Ingrese el valor del segundo numero: ");
			valorb = int.Parse(Console.ReadLine());
			Console.WriteLine("Digite el numero de la operacion que desea hacer: ");
			Console.WriteLine("1) Suma");
			Console.WriteLine("2) Resta");
			Console.WriteLine("3) Multiplicacion");
			Console.WriteLine("4) Division");
			operacion = int.Parse(Console.ReadLine());
			if (operacion==1) {
				valorc = valora+valorb;
				Console.WriteLine("El valor de la operacion Suma es: "+valorc);
			} else {
				if (operacion==2) {
					valorc = valora-valorb;
					Console.WriteLine("El valor de la operacion Resta es: "+valorc);
				} else {
					if (operacion==3) {
						valorc = valora*valorb;
						Console.WriteLine("El valor de la operacion Multiplicacion es: "+valorc);
					} else {
						if (operacion==4) {
							if (valorb==0) {
								Console.WriteLine("El valor ingresado en el segundo valor es erroneo. Prueba nuevamente");
							} else {
								valorc = valora/valorb;
								Console.WriteLine("El valor de la operacion Division es: "+valorc);
							}
						} else {
							Console.WriteLine("El numero ingresado en el menu de la operacion no corresponde a ninguna de las opciones. Prueba nuevamente");
						}
					}
				}
			}
		}

	}

}

