// Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
// Es posible que el codigo generado no sea completamente correcto. Si encuentra
// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

using System;

namespace PSeInt {
	class ciclouniversidad {

		static void Main(string[] args) {
			int calculartiempo;
			string nombre;
			string respuestaclases;
			string respuestadebano;
			string respuestadesayuno;
			int respuestahora;
			int respuestahoraactual;
			string respuestalevantar;
			string respuestallevartodo;
			string respuestametododetransporte;
			string respuestaplanesdia;
			string respuestasalir;
			string respuestavestirse;
			Console.WriteLine("***Rutina Universidad***");
			Console.WriteLine("Buenos dias. Cual es tu nombre? ");
			nombre = Console.ReadLine();
			Console.WriteLine("Señor@ "+nombre+" Hoy tienes clases");
			respuestaclases = Console.ReadLine();
			if (respuestaclases.Equals("si")) {
				Console.WriteLine("Que horas son");
				respuestahoraactual = int.Parse(Console.ReadLine());
				Console.WriteLine("A que horas debes ir");
				respuestahora = int.Parse(Console.ReadLine());
				calculartiempo = respuestahora-respuestahoraactual;
				if (calculartiempo<2) {
					Console.WriteLine("Date prisa que ya esta cerca tu hora de entrada");
				} else {
					Console.WriteLine("Ya te levantaste de la cama");
					respuestalevantar = Console.ReadLine();
					if (respuestalevantar.Equals("si")) {
						Console.WriteLine("Genial, ya te bañaste");
						respuestadebano = Console.ReadLine();
						if (respuestadebano.Equals("si")) {
							Console.WriteLine("ohh eres un rayo, ya estas vestido");
							respuestavestirse = Console.ReadLine();
							if (respuestavestirse.Equals("si")) {
								Console.WriteLine("Vaya que eres rapido. Te ves genial");
								Console.WriteLine("Ya desayunaste");
								respuestadesayuno = Console.ReadLine();
								if (respuestadesayuno.Equals("si")) {
									Console.WriteLine("Espero que tu desayuno estuviera genial y que estes satifech@");
									Console.WriteLine("¿Llevas todo? No te se queda algo?");
									respuestallevartodo = Console.ReadLine();
									if (respuestallevartodo.Equals("si")) {
										Console.WriteLine("Ya vas a salir para tu clase");
										respuestasalir = Console.ReadLine();
										if (respuestasalir.Equals("si")) {
											Console.WriteLine("En que te vas a ir");
											respuestametododetransporte = Console.ReadLine();
											if (respuestametododetransporte.Equals("Bus") || respuestametododetransporte.Equals("uber") || respuestametododetransporte.Equals("carro")) {
												Console.WriteLine("Genial espero que te vaya bien. Recuerda el cinturon de seguridad siempre ;)");
												Console.WriteLine("Que tengas un increible dia. Feliz dia");
											} else {
												Console.WriteLine("Eso suena fantastico es bueno hacer un poco de ejercicio");
												Console.WriteLine("Que tengas un increible dia. Feliz dia");
											}
										} else {
											Console.WriteLine("Vamos ve saliendo para que no te afanes");
										}
									} else {
										Console.WriteLine("Menos mal te recuerdo");
									}
								} else {
									Console.WriteLine("Ve y come algo el desayuno es la comida mas importante del dia");
								}
							} else {
								Console.WriteLine("Vamos, ponte esa ropa que tanto te gusta y sal a lucirla");
							}
						} else {
							Console.WriteLine("Ve y bañate para que tengas un magnifico dia");
						}
					} else {
						Console.WriteLine("Vamos levantante que ya comenzo el dia");
					}
				}
			} else {
				Console.WriteLine("Cuales son tus planes para hoy");
				respuestaplanesdia = Console.ReadLine();
				if (respuestaplanesdia.Equals("nada")) {
					Console.WriteLine("Vamos animate ve a cine o sal con tus amigos o ve por un helado");
				} else {
					Console.WriteLine("Ohh eso suena increible espero que la pases genial. Buena suerte");
				}
			}
		}

	}

}

