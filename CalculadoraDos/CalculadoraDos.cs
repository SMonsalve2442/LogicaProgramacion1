// Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
// Es posible que el codigo generado no sea completamente correcto. Si encuentra
// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

using System;

namespace PSeInt {
	class calculadorados {

		static void Main(string[] args) {
			string operacion;
			int valora;
			int valorb;
			double valorc;
			Console.WriteLine("***Calculadora Pos***");
			Console.WriteLine("Ingrese el primer numero: ");
			valora = int.Parse(Console.ReadLine());
			Console.WriteLine("Ingrese el segundo numero: ");
			valorb = int.Parse(Console.ReadLine());
			if (valora==0 && valorb==0) {
				Console.WriteLine("Los valores ingresados daran como resultado 0 sin importar la operacion que deseas realizar");
			} else {
				Console.WriteLine("Ingrese de manera escrita cual de las operaciones desea realizar (suma/resta/multiplicacion/division)");
				operacion = Console.ReadLine();
				if (operacion.Equals("suma")) {
					valorc = valora+valorb;
					Console.WriteLine("El resultado de la suma es: "+valorc);
				} else {
					if (operacion.Equals("resta")) {
						valorc = valora-valorb;
						Console.WriteLine("El resultado de la resta es: "+valorc);
					} else {
						if (operacion.Equals("multiplicacion")) {
							valorc = valora*valorb;
							Console.WriteLine("El resultado de la multiplicacion es: "+valorc);
						} else {
							if (operacion.Equals("division")) {
								if (valorb!=0) {
									valorc = valora/valorb;
									Console.WriteLine("El resultado de la division es: "+valorc);
								} else {
									Console.WriteLine("El valor asignado al divisor es erroneo no se puede dividir por cero");
								}
							}
						}
					}
				}
			}
		}

	}

}

