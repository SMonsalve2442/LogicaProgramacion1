Algoritmo RutinaSemanal
	
	Escribir "Simon Monsalve Higuita"
	Escribir "Logica Programacion 1"
	Escribir "601"
	Escribir "17/02/2025"
	Escribir "***Rutina Semanal***"
	
	Definir Nombre, Respuesta Como Caracter
	Definir DiaSemana, Hora, contadordia, cantDias Como Entero
	
	Escribir "Ingresa tu nombre"
	Leer Nombre
	
	Respuesta = "si"
	Mientras Respuesta = "si" Hacer
		Escribir "Ingresa el dia de la semana en el que estas"
		Escribir "1) lunes"
		Escribir "2) Martes"
		Escribir "3) Miercoles"
		Escribir "4) Jueves"
		Escribir "5) Viernes"
		Escribir "6) Sabado"
		Leer cantDias
		si cantDias = 1 Entonces
			 DiaSemana = 0 
		SiNo
			si cantDias = 2 Entonces
				DiaSemana = 1
			SiNo
				si cantDias = 3 Entonces
					DiaSemana = 2
				SiNo
					si cantDias = 4 entonces
						DiaSemana = 3
					SiNo
						si cantDias = 5 Entonces
							DiaSemana = 4
						SiNo
							si cantDias = 6 Entonces
								DiaSemana = 5
							SiNo
								Escribir "El dia que ingresaste o lo has copiado diferente a la indicacion. Vuelve a intentarlo"
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
		si cantDias = 5 o cantDias = 0 o cantDias = 1 o cantDias = 2 o cantDias = 3 o cantDias = 4 Entonces
			si DiaSemana == 0 Entonces
				Escribir "El dia en el que estas es Lunes. Hoy debes asistir a la universidad"
				Escribir "Ingresa la hora actual (Formato de 24 horas)"
				Leer Hora
				si Hora >= 6 y Hora < 12 Entonces
					Escribir "Buenos dias. Señor ", Nombre
				SiNo
					si Hora >= 12 y Hora < 18 Entonces
						Escribir "Buenos tardes. Señor ", Nombre
					SiNo
						Escribir "Buenos noches. Señor ", Nombre
					FinSi
				FinSi
			FinSi
			si DiaSemana == 1 Entonces
				Escribir "El dia en el que estas es Martes. Hoy debes asistir a la universidad"
				Escribir "Ingresa la hora actual (Formato de 24 horas)"
				Leer Hora
				si Hora >= 6 y Hora < 12 Entonces
					Escribir "Buenos dias. Señor ", Nombre
				SiNo
					si Hora >= 12 y Hora < 18 Entonces
						Escribir "Buenos tardes. Señor ", Nombre
					SiNo
						Escribir "Buenos noches. Señor ", Nombre
					FinSi
				FinSi
			FinSi
			si DiaSemana == 2 Entonces
				Escribir "El dia en el que estas es Miercoles. Hoy debes asistir a la universidad"
				Escribir "Ingresa la hora actual (Formato de 24 horas)"
				Leer Hora
				si Hora >= 6 y Hora < 12 Entonces
					Escribir "Buenos dias. Señor ", Nombre
				SiNo
					si Hora >= 12 y Hora < 18 Entonces
						Escribir "Buenos tardes. Señor ", Nombre
					SiNo
						Escribir "Buenos noches. Señor ", Nombre
					FinSi
				FinSi
			FinSi
			si DiaSemana == 3 Entonces
				Escribir "El dia en el que estas es Jueves. Hoy debes asistir a la universidad"
				Escribir "Ingresa la hora actual (Formato de 24 horas)"
				Leer Hora
				si Hora >= 6 y Hora < 12 Entonces
					Escribir "Buenos dias. Señor ", Nombre
				SiNo
					si Hora >= 12 y Hora < 18 Entonces
						Escribir "Buenos tardes. Señor ", Nombre
					SiNo
						Escribir "Buenos noches. Señor ", Nombre
						FinSi
					FinSi
			FinSi
			si DiaSemana == 4 Entonces
				Escribir "El dia en el que estas es Viernes. Hoy debes asistir a la universidad"
				Escribir "Ingresa la hora actual (Formato de 24 horas)"
				Leer Hora
				si Hora >= 6 y Hora < 12 Entonces
					Escribir "Buenos dias. Señor ", Nombre
				SiNo
					si Hora >= 12 y Hora < 18 Entonces
						Escribir "Buenos tardes. Señor ", Nombre
					SiNo
						Escribir "Buenos noches. Señor ", Nombre
					FinSi
				FinSi
			FinSi
			si DiaSemana == 5 Entonces
				Escribir "El dia en el que estas es Sabado. Hoy puedes descansar"
				Escribir "Ingresa la hora actual (Formato de 24 horas)"
				Leer Hora
				si Hora >= 6 y Hora < 12 Entonces
					Escribir "Buenos dias. Señor ", Nombre
				SiNo
					si Hora >= 12 y Hora < 18 Entonces
						Escribir "Buenos tardes. Señor ", Nombre
					SiNo
						Escribir "Buenos noches. Señor ", Nombre
					FinSi
				FinSi
			FinSi
			Escribir "**********"
		FinSi
		Escribir "Deseas ingresar otro dia (si/no)"
		Leer Respuesta
	FinMientras
FinAlgoritmo