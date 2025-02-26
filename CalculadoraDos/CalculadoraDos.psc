Algoritmo CalculadoraDos
	
	Escribir "***Calculadora Pos***"
	
	Definir ValorA, ValorB Como Entero
	Definir ValorC Como Real
	Definir Operacion Como Caracter
	
	Escribir "Ingrese el primer numero: "
	Leer ValorA
	
	Escribir "Ingrese el segundo numero: "
	Leer ValorB
	
	si valorA = 0 y ValorB = 0 Entonces
		Escribir "Los valores ingresados daran como resultado 0 sin importar la operacion que deseas realizar"
	SiNo
		Escribir "Ingrese de manera escrita cual de las operaciones desea realizar (suma/resta/multiplicacion/division)"
		Leer Operacion
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
	FinSi
FinAlgoritmo
