Algoritmo ContadorCicloMientras
	
	Escribir "Simon Monsalve Higuita"
	Escribir "Logica Programacion 1"
	Escribir "601"
	Escribir "17/02/2025"
	
	Escribir "***Contador ciclo mientras***"
	
	Definir cont, limite Como Entero
	Definir mensaje, nombre Como Caracter
	
	Escribir "Ingrese su nombre"
	Leer nombre	
	
	Escribir "Ingresa el numero de impresiones"
	Leer limite
	
	cont = 0
	mensaje = "Hola "
	
	Mientras cont <= limite Hacer
		Escribir "Hola ", nombre, " tu contador es: ", cont
		cont = cont + 1
	FinMientras
	
FinAlgoritmo