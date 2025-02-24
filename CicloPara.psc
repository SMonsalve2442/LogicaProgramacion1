Algoritmo CicloPara
	
	Escribir "Simon Monsalve Higuita"
	Escribir "Logica Programacion 1"
	Escribir "601"
	Escribir "24/02/2025"
	Escribir "***Rutina Ciclo Para Aire Acondicionado***"
	
	Definir ResEncendido, Restemperatura, RestemperaturaDeseada, Resrepetimiento, suma Como entero
	
	Escribir "Señor usuario desea encender el aire acondicionado?"
	Escribir "1) Si"
	Escribir "2) No"
	Leer ResEncendido
	
	si ResEncendido = 1 Entonces
		Resrepetimiento = 1
		
		Mientras Resrepetimiento = 1 Hacer
			Escribir "Ingerese la temperatura en la que se encuentra el aire"
			Leer Restemperatura
			Escribir "Ingrese la temperatura que desea que se establesca el aire"
			Leer RestemperaturaDeseada
			si RestemperaturaDeseada <=20 o RestemperaturaDeseada >=50 Entonces
				Escribir "La temperatura que deseas no esta en el rango disponible en este aire"
			SiNo
				si Restemperatura < RestemperaturaDeseada Entonces
					Para Restemperatura = Restemperatura Hasta RestemperaturaDeseada Con Paso 1 Hacer
						Escribir "El aire acondicionado se encuentra en ", Restemperatura " y esta incrementando hasta: ", RestemperaturaDeseada
						suma = 1
					Fin Para
				SiNo
					si Restemperatura > RestemperaturaDeseada Entonces
						Para Restemperatura = Restemperatura Hasta RestemperaturaDeseada Con Paso -1 Hacer
							Escribir "El aire acondicionado se encuentra en ", Restemperatura " y esta disminuyendo hasta: ", RestemperaturaDeseada
							suma = 2
						Fin Para
					FinSi
				FinSi
				si suma = 1 Entonces
					Escribir "La temperatura actual es: ", Restemperatura -1
				SiNo
					Escribir "La temperatura actual es: ", Restemperatura +1
				FinSi
			FinSi
			Escribir "Señor usuario desea hacer otro cambio en la temperatura del aire: "
			Escribir "1) Si"
			Escribir "2) No"
			Leer Resrepetimiento
		FinMientras
	SiNo
		Escribir "Señor usuario su eleccion fue 2 es decir que no desea prender el aire"
	FinSi
	
FinAlgoritmo