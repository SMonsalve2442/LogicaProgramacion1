// Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
// Es posible que el codigo generado no sea completamente correcto. Si encuentra
// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

using System;

namespace PSeInt {
	class contadorciclomientras {

		static void Main(string[] args) {
			int cont;
			int limite;
			string mensaje;
			string nombre;
			Console.WriteLine("Simon Monsalve Higuita");
			Console.WriteLine("Logica Programacion 1");
			Console.WriteLine("601");
			Console.WriteLine("17/02/2025");
			Console.WriteLine("***Contador ciclo mientras***");
			Console.WriteLine("Ingrese su nombre");
			nombre = Console.ReadLine();
			Console.WriteLine("Ingresa el numero de impresiones");
			limite = int.Parse(Console.ReadLine());
			cont = 0;
			mensaje = "Hola ";
			while (cont<=limite) {
				Console.WriteLine("Hola "+nombre+" tu contador es: "+cont);
				cont = cont+1;
			}
		}

	}

}

