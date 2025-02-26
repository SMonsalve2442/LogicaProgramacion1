/* Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "RUTINASEMANAL.java."

import java.io.*;

public class rutinasemanal {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cantdias;
		int contadordia;
		int diasemana;
		int hora;
		String nombre;
		String respuesta;
		System.out.println("Simon Monsalve Higuita");
		System.out.println("Logica Programacion 1");
		System.out.println("601");
		System.out.println("17/02/2025");
		System.out.println("***Rutina Semanal***");
		System.out.println("Ingresa tu nombre");
		nombre = bufEntrada.readLine();
		respuesta = "si";
		while (respuesta.equals("si")) {
			System.out.println("Ingresa el dia de la semana en el que estas");
			System.out.println("1) lunes");
			System.out.println("2) Martes");
			System.out.println("3) Miercoles");
			System.out.println("4) Jueves");
			System.out.println("5) Viernes");
			System.out.println("6) Sabado");
			cantdias = Integer.parseInt(bufEntrada.readLine());
			if (cantdias==1) {
				diasemana = 0;
			} else {
				if (cantdias==2) {
					diasemana = 1;
				} else {
					if (cantdias==3) {
						diasemana = 2;
					} else {
						if (cantdias==4) {
							diasemana = 3;
						} else {
							if (cantdias==5) {
								diasemana = 4;
							} else {
								if (cantdias==6) {
									diasemana = 5;
								} else {
									System.out.println("El dia que ingresaste o lo has copiado diferente a la indicacion. Vuelve a intentarlo");
								}
							}
						}
					}
				}
			}
			if (cantdias==5 || cantdias==0 || cantdias==1 || cantdias==2 || cantdias==3 || cantdias==4) {
				if (diasemana==0) {
					System.out.println("El dia en el que estas es Lunes. Hoy debes asistir a la universidad");
					System.out.println("Ingresa la hora actual (Formato de 24 horas)");
					hora = Integer.parseInt(bufEntrada.readLine());
					if (hora>=6 && hora<12) {
						System.out.println("Buenos dias. Señor "+nombre);
					} else {
						if (hora>=12 && hora<18) {
							System.out.println("Buenos tardes. Señor "+nombre);
						} else {
							System.out.println("Buenos noches. Señor "+nombre);
						}
					}
				}
				if (diasemana==1) {
					System.out.println("El dia en el que estas es Martes. Hoy debes asistir a la universidad");
					System.out.println("Ingresa la hora actual (Formato de 24 horas)");
					hora = Integer.parseInt(bufEntrada.readLine());
					if (hora>=6 && hora<12) {
						System.out.println("Buenos dias. Señor "+nombre);
					} else {
						if (hora>=12 && hora<18) {
							System.out.println("Buenos tardes. Señor "+nombre);
						} else {
							System.out.println("Buenos noches. Señor "+nombre);
						}
					}
				}
				if (diasemana==2) {
					System.out.println("El dia en el que estas es Miercoles. Hoy debes asistir a la universidad");
					System.out.println("Ingresa la hora actual (Formato de 24 horas)");
					hora = Integer.parseInt(bufEntrada.readLine());
					if (hora>=6 && hora<12) {
						System.out.println("Buenos dias. Señor "+nombre);
					} else {
						if (hora>=12 && hora<18) {
							System.out.println("Buenos tardes. Señor "+nombre);
						} else {
							System.out.println("Buenos noches. Señor "+nombre);
						}
					}
				}
				if (diasemana==3) {
					System.out.println("El dia en el que estas es Jueves. Hoy debes asistir a la universidad");
					System.out.println("Ingresa la hora actual (Formato de 24 horas)");
					hora = Integer.parseInt(bufEntrada.readLine());
					if (hora>=6 && hora<12) {
						System.out.println("Buenos dias. Señor "+nombre);
					} else {
						if (hora>=12 && hora<18) {
							System.out.println("Buenos tardes. Señor "+nombre);
						} else {
							System.out.println("Buenos noches. Señor "+nombre);
						}
					}
				}
				if (diasemana==4) {
					System.out.println("El dia en el que estas es Viernes. Hoy debes asistir a la universidad");
					System.out.println("Ingresa la hora actual (Formato de 24 horas)");
					hora = Integer.parseInt(bufEntrada.readLine());
					if (hora>=6 && hora<12) {
						System.out.println("Buenos dias. Señor "+nombre);
					} else {
						if (hora>=12 && hora<18) {
							System.out.println("Buenos tardes. Señor "+nombre);
						} else {
							System.out.println("Buenos noches. Señor "+nombre);
						}
					}
				}
				if (diasemana==5) {
					System.out.println("El dia en el que estas es Sabado. Hoy puedes descansar");
					System.out.println("Ingresa la hora actual (Formato de 24 horas)");
					hora = Integer.parseInt(bufEntrada.readLine());
					if (hora>=6 && hora<12) {
						System.out.println("Buenos dias. Señor "+nombre);
					} else {
						if (hora>=12 && hora<18) {
							System.out.println("Buenos tardes. Señor "+nombre);
						} else {
							System.out.println("Buenos noches. Señor "+nombre);
						}
					}
				}
				System.out.println("**********");
			}
			System.out.println("Deseas ingresar otro dia (si/no)");
			respuesta = bufEntrada.readLine();
		}
	}


}

