Algoritmo Calculadora
	
    Definir ValorA, ValorB, Operacion Como Entero
    Definir ValorC Como Real
	
    Escribir "Ingrese el valor del primer numero: "
    Leer ValorA
	
    Escribir "Ingrese el valor del segundo numero: "
    Leer ValorB
	
    Escribir "Digite el numero de la operacion que desea hacer: "
    Escribir "1) Suma"
    Escribir "2) Resta"
    Escribir "3) Multiplicacion"
    Escribir "4) Division"
    Leer Operacion
	
    Si Operacion == 1 Entonces
        ValorC = ValorA + ValorB
        Escribir "El valor de la operacion Suma es: ", ValorC
    Sino
        Si Operacion == 2 Entonces
            ValorC = ValorA - ValorB
            Escribir "El valor de la operacion Resta es: ", ValorC
        Sino
            Si Operacion == 3 Entonces
                ValorC = ValorA * ValorB
                Escribir "El valor de la operacion Multiplicacion es: ", ValorC
            Sino
                Si Operacion == 4 Entonces
                    Si ValorB == 0 Entonces
                        Escribir "El valor ingresado en el segundo valor es erroneo. Prueba nuevamente"
                    Sino
                        ValorC = ValorA / ValorB
                        Escribir "El valor de la operacion Division es: ", ValorC
                    FinSi
                Sino
                    Escribir "El numero ingresado en el menu de la operacion no corresponde a ninguna de las opciones. Prueba nuevamente"
                FinSi
            FinSi
        FinSi
    FinSi
FinAlgoritmo
