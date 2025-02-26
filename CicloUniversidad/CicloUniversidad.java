/* Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CICLOUNIVERSIDAD.java."

import java.io.*;

public class ciclouniversidad {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int calculartiempo;
		String nombre;
		String respuestaclases;
		String respuestadebano;
		String respuestadesayuno;
		int respuestahora;
		int respuestahoraactual;
		String respuestalevantar;
		String respuestallevartodo;
		String respuestametododetransporte;
		String respuestaplanesdia;
		String respuestasalir;
		String respuestavestirse;
		System.out.println("***Rutina Universidad***");
		System.out.println("Buenos dias. Cual es tu nombre? ");
		nombre = bufEntrada.readLine();
		System.out.println("Señor@ "+nombre+" Hoy tienes clases");
		respuestaclases = bufEntrada.readLine();
		if (respuestaclases.equals("si")) {
			System.out.println("Que horas son");
			respuestahoraactual = Integer.parseInt(bufEntrada.readLine());
			System.out.println("A que horas debes ir");
			respuestahora = Integer.parseInt(bufEntrada.readLine());
			calculartiempo = respuestahora-respuestahoraactual;
			if (calculartiempo<2) {
				System.out.println("Date prisa que ya esta cerca tu hora de entrada");
			} else {
				System.out.println("Ya te levantaste de la cama");
				respuestalevantar = bufEntrada.readLine();
				if (respuestalevantar.equals("si")) {
					System.out.println("Genial, ya te bañaste");
					respuestadebano = bufEntrada.readLine();
					if (respuestadebano.equals("si")) {
						System.out.println("ohh eres un rayo, ya estas vestido");
						respuestavestirse = bufEntrada.readLine();
						if (respuestavestirse.equals("si")) {
							System.out.println("Vaya que eres rapido. Te ves genial");
							System.out.println("Ya desayunaste");
							respuestadesayuno = bufEntrada.readLine();
							if (respuestadesayuno.equals("si")) {
								System.out.println("Espero que tu desayuno estuviera genial y que estes satifech@");
								System.out.println("¿Llevas todo? No te se queda algo?");
								respuestallevartodo = bufEntrada.readLine();
								if (respuestallevartodo.equals("si")) {
									System.out.println("Ya vas a salir para tu clase");
									respuestasalir = bufEntrada.readLine();
									if (respuestasalir.equals("si")) {
										System.out.println("En que te vas a ir");
										respuestametododetransporte = bufEntrada.readLine();
										if (respuestametododetransporte.equals("Bus") || respuestametododetransporte.equals("uber") || respuestametododetransporte.equals("carro")) {
											System.out.println("Genial espero que te vaya bien. Recuerda el cinturon de seguridad siempre ;)");
											System.out.println("Que tengas un increible dia. Feliz dia");
										} else {
											System.out.println("Eso suena fantastico es bueno hacer un poco de ejercicio");
											System.out.println("Que tengas un increible dia. Feliz dia");
										}
									} else {
										System.out.println("Vamos ve saliendo para que no te afanes");
									}
								} else {
									System.out.println("Menos mal te recuerdo");
								}
							} else {
								System.out.println("Ve y come algo el desayuno es la comida mas importante del dia");
							}
						} else {
							System.out.println("Vamos, ponte esa ropa que tanto te gusta y sal a lucirla");
						}
					} else {
						System.out.println("Ve y bañate para que tengas un magnifico dia");
					}
				} else {
					System.out.println("Vamos levantante que ya comenzo el dia");
				}
			}
		} else {
			System.out.println("Cuales son tus planes para hoy");
			respuestaplanesdia = bufEntrada.readLine();
			if (respuestaplanesdia.equals("nada")) {
				System.out.println("Vamos animate ve a cine o sal con tus amigos o ve por un helado");
			} else {
				System.out.println("Ohh eso suena increible espero que la pases genial. Buena suerte");
			}
		}
	}


}

