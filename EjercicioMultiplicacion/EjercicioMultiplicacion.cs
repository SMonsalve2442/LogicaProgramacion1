// Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
// Es posible que el codigo generado no sea completamente correcto. Si encuentra
// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

using System;

namespace PSeInt {
	class ejerciciomultiplicacion {

		static void Main(string[] args) {
			int a;
			int b;
			int c;
			Console.WriteLine("Ingrese el numero que desea asignar a A: ");
			a = int.Parse(Console.ReadLine());
			Console.WriteLine("Ingrese el numero que desea asignar a B: ");
			b = int.Parse(Console.ReadLine());
			c = a*b;
			Console.WriteLine("La multiplicacion es: "+c);
		}

	}

}

