Algoritmo CalculadoraTres
	
	Escribir "***Calculadora in***"
	
	Definir ValorA Como Entero

	Escribir "Ingrese el primer numero: "
	Leer ValorA
	
	si ValorA = 0 o ValorA <> 0 Entonces
		Definir ValorB Como Entero
		Definir Operacion Como Caracter
		Definir  ValorC Como Real
		Escribir "Ingrese de manera escrita cual de las operaciones desea realizar (suma/resta/multiplicacion/division)"
		Leer Operacion
		//Validacion de operacion posible
		si Operacion = "suma" o Operacion = "resta" o Operacion = "multiplicacion" o Operacion = "division" Entonces
			Escribir "Ingrese el segundo numero: "
			Leer ValorB
			si Operacion = "suma" Entonces
				ValorC = ValorA + ValorB
				Escribir "El resultado de la suma es: ", ValorC
			SiNo
				si Operacion = "resta" Entonces
					ValorC = ValorA - ValorB
					Escribir "El resultado de la resta es: ", ValorC
				SiNo
					si Operacion = "multiplicacion" Entonces
						ValorC = ValorA * ValorB
						Escribir "El resultado de la multiplicacion es: ", ValorC
					SiNo
						si Operacion = "division" Entonces
							si ValorB <> 0 Entonces
								ValorC = ValorA / ValorB
								Escribir "El resultado de la division es: ", ValorC
							SiNo
								Escribir "El valor asignado al divisor es erroneo no se puede dividir por cero" 
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		SiNo
			Escribir "La operacion ingresada no esta disponible"
		FinSi
	SiNo
		Escribir "El dato ingresado en el campo del ingreso del primer numero es erroneo"
	FinSi
FinAlgoritmo
